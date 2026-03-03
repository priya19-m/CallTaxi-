package com.kce.taxi.in;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaxiService {
	static int bookingCounter = 1;
	List<Taxi> taxis = new ArrayList<>();
	public TaxiService(int taxiCount) {
		for(int i=1;i<=taxiCount;i++) {
			taxis.add(new Taxi(i));
		}
	}
	
	public void bookTaxi(int customerId, char pickup, char drop, int pickupTime) {
		List<Taxi> availableTaxis = new ArrayList<>();
		for(Taxi taxi : taxis) {
			int distanceToPickup = Math.abs(taxi.currentLocation - pickup);
			int travelTime = distanceToPickup;
			if(taxi.freeTime + travelTime <= pickupTime) {
				availableTaxis.add(taxi);
			}
		}
		if(availableTaxis.isEmpty()) {
			System.out.println("No Taxi is Available.Booking Rejected");
			return;
		}
		availableTaxis.sort(Comparator
				.comparingInt((Taxi t) -> Math.abs(t.currentLocation - pickup))
				.thenComparingInt(t -> t.totalEarnings));
		Taxi allottedTaxi = availableTaxis.get(0);
		int distance = Math.abs(drop - pickup)*15;
		int amount = calculateFare(distance);
		int dropTime = pickupTime + Math.abs(drop - pickup);
		
		Booking booking = new Booking(
				bookingCounter++,
				customerId,
				pickup,
				drop,
				pickupTime,
				dropTime,
				amount
				);
		allottedTaxi.addBooking(booking);
		System.out.println("Taxi can be allotted.Taxi-" + allottedTaxi.taxiId + "is allotted.");		
	}
	private int calculateFare(int distance) {
		if(distance <= 5) return 100;
		return 100 + (distance - 5)* 10;
	}
	
	public void displayTaxiDeatils() {
		for(Taxi taxi : taxis) {
			System.out.println("\nTaxi -" + taxi.taxiId + "Total Earnings: Rs." + taxi.totalEarnings);
			System.out.println("BookingId  CustomerId  From  To  PickupTime  DropTime  Amount");
			for(Booking b : taxi.bookings) {
				 System.out.println(b.bookingId + "          " +
	                        b.customerId + "           " +
	                        b.from + "     " +
	                        b.to + "   " +
	                        b.pickupTime + "           " +
	                        b.dropTime + "        " +
	                        b.amount);
			}
		}
	}

}
