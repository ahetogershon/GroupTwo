# GROUP TWO MEMBERS
# *Emmanuel Kwame Adjei*
# *Audrey peprah*
# *Aaron Bryon Akpalu*
# *Jemuel Venunye Lawson*
# *Gershon Aheto*
Table of Contents
Overview
Features
Technologies
Getting Started
Usage
Class Structure
Contributing
Future Enhancements


# overview
The Vehicle Rental System is a Java-based console application designed to simulate a vehicle rental service. 
It allows users to rent, return, and manage various types of vehicles such as 
cars, bikes, and trucks. Each vehicle type has its own rental cost calculation, and the system keeps track of available vehicles and rental transactions.
# Features
 Vehicle Management: Supports renting and returning multiple types of vehicles (e.g., cars, bikes, trucks).
 Rental Cost Calculation: Calculates rental costs based on vehicle type and rental duration.
 Availability Tracking: Keeps track of which vehicles are available for rent.
 Simple CLI Interface: User-friendly console interface for interaction.
 Extensibility: Easily extendable to add more vehicle types and features.
 Technologies
Java: Core programming language for implementing the system.
OOP Concepts: The project is built with object-oriented programming principles in mind.
Usage
After running the application, you will be presented with a simple menu:


==== Vehicle Rental System ====
1. Rent a Vehicle
2. Return a Vehicle
3. View All Rentals
4. Quit

Renting a Vehicle
The system will display a list of available vehicles. Select a vehicle, specify the number of days, and the rental transaction will be processed.
Returning a Vehicle
View all ongoing rentals and return a vehicle by selecting it from the list. The system will update the availability of the vehicle.
Class Structure
Vehicle (abstract): Represents a generic vehicle.
Car, Bike, Truck: Subclasses of Vehicle with specific rental cost calculation.
RentalTransaction: Stores rental details for each transaction.
Customer: Represents the customer renting a vehicle.
Main: The entry point that handles the system's interaction with the user.   
 
