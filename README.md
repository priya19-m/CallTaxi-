## Call Taxi Booking Application (Java Console Project)

## Project Description
   The Call Taxi Booking Application is a console-based Java project that simulates a real-world taxi booking system.
   Customers can book taxis available at predefined points on a linear route. The system allocates taxis based on availability, distance, and earnings rules.
This project demonstrates:
  1. Object-Oriented Programming (OOP)
  2. Collections Framework
  3. Sorting with multiple conditions
  4. Real-world system design logic

## Problem Assumptions
  1. Taxi Count: 4 (Scalable to any number)
  2. Route Points: A, B, C, D, E, F
  3. Distance Between Points: 15 km
  4. Travel Time Between Points: 1 hour
  5. Charges:
     Rs.100 for first 5 km
     Rs.10 per km after 5 km
  6. Initial Position: All taxis start at Point A

## Booking Rules
  1. A free taxi at the pickup point is allocated first.
  2. If not available, the nearest free taxi is allocated.
  3. If two taxis are at the same location, the taxi with lower earnings is allocated.
  4. Taxis charge only from pickup to drop.
  5. If no taxi is available, booking is rejected.

## Project Structure
``` plaintext
com.kce.taxi.in
│
├── Main.java
├── Taxi.java
├── Booking.java
└── TaxiService.java
```

## Modules
## Module 1: Call Taxi Booking
Accepts customer ID, pickup point, drop point, and pickup time
Allocates taxi based on rules
Calculates fare
Stores booking details

## Module 2: Display Taxi Details
Displays total earnings of each taxi
Displays complete booking history

## Fare Calculation Logic
If Distance ≤ 5 km: Fare = Rs.100
If Distance > 5 km: Fare = 100 + (Distance - 5) × 10

## How to Run
1. Open in Java IDE (Eclipse)
2. Ensure package name is com.kce.taxi.in
3. Run Main.java

## Technologies Used
Java
OOP Concepts
ArrayList
Comparator Sorting

## Learning Outcomes
Designing scalable systems.
Applying real-world allocation logic.
Handling time & distance calculations.
Managing object relationships.

## OUTPUT:
<img width="1343" height="679" alt="image" src="https://github.com/user-attachments/assets/8e75bd28-5971-4325-9dd6-e32d197b4e2e" />

## STUDENT DETAILS:
NAME: PRIYADHARSHINI M     ROLL NO: 717823P141
