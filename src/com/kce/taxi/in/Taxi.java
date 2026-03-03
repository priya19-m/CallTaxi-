package com.kce.taxi.in;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
	int taxiId;
	char currentLocation = 'A';
	int freeTime = 0;
	int totalEarnings = 0;
	List<Booking> bookings = new ArrayList<>();
	public Taxi(int taxiId) {
		this.taxiId = taxiId;
	}
	
	public void addBooking(Booking booking) {
		bookings.add(booking);
		totalEarnings+=booking.amount;
		currentLocation = booking.to;
		freeTime=booking.dropTime;
	}

}
