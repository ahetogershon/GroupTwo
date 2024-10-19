# GROUP TWO MEMBERS
1.  *Emmanuel Kwame Adjei*(BSCIT/GA/14/22/0018)
2.  *Audrey peprah*(BSCIT/GA/14/23/0012)
3.  *Aaron Bryon Akpalu*(BSCIT/GA/14/23/0019)
4.  *Jemuel Venunye Lawson*(BSCIT/GA/14/22/0008)
5.  *Gershon Aheto*(BSCIT/GA/14/22/0008)
# PROJECT:===Vehicle Rental System==
# Table of Contents
1.Overview
2.Features
3.Technologies
4.Usage


# overview
The Vehicle Rental System is a Java-based console application designed to simulate a vehicle rental service. 
It allows users to rent, return, and manage various types of vehicles such as 
cars, bikes, and trucks. Each vehicle type has its own rental cost calculation, and the system keeps track of available vehicles and rental transactions.
# Features
1. Vehicle Management: Supports renting and returning multiple types of vehicles (e.g., cars, bikes, trucks).
2. Rental Cost Calculation: Calculates rental costs based on vehicle type and rental duration.
3. Availability Tracking: Keeps track of which vehicles are available for rent.
4.Simple CLI Interface: User-friendly console interface for interaction.
5. Extensibility: Easily extendable to add more vehicle types and features.
6. 
# Technologies
1.Java: Core programming language for implementing the system.
2.OOP Concepts: The project is built with object-oriented programming principles in mind.

# Usage
After running the application, you will be presented with a simple menu:
Enter Your Name:
Enter Your License Number:


==== Vehicle Rental System ====
1. Rent a Vehicle
2. Return a Vehicle
3. View All Rentals
4. Quit

Taking User Input: 
The system takes users information before proceeding to have access to the main menu.

Renting a Vehicle:
The system will display a list of available vehicles. Select a vehicle, specify the number of days, and the rental transaction will be processed.

Returning a Vehicle:
View all ongoing rentals and return a vehicle by selecting it from the list. The system will update the availability of the vehicle.

Class Structure:
Vehicle (abstract): Represents a generic vehicle.
Car, Bike, Truck: Subclasses of Vehicle with specific rental cost calculation.

RentalTransaction: 
Stores rental details for each transaction.

Customer: 
Represents the customer renting a vehicle.

Main: 
The entry point that handles the system's interaction with the user.   
 
