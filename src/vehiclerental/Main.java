package vehiclerental;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


    private static List<Vehicle> availableVehicles = new ArrayList<>();
    private static List<RentalTransaction> rentalTransactions = new ArrayList<>();

    public static void main(String[] args) {
        // Initialize available vehicles
        availableVehicles.add(new Car("GG 3962-18", "Chevrolet Spark", true));
        availableVehicles.add(new Bike("M GR 1-20", "Yamaha MT", true));
        availableVehicles.add(new Truck("GS 2-25", "Ford F-150", 1200));



        // Create scanner for input
        Scanner scanner = new Scanner(System.in);

        // Get customer details
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter your driver's license number: ");
        String driverLicenseNumber = scanner.nextLine();

        // Create a new customer
        Customer customer = new Customer(customerName, driverLicenseNumber);
        boolean quit = false;

        while (!quit) {
            try {
                System.out.println("\n==== Vehicle Rental System ====");
                System.out.println("1. Rent a Vehicle");
                System.out.println("2. Return a Vehicle");
                System.out.println("3. View All Rentals");
                System.out.println("4. Quit");
                System.out.print("Select an option: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        rentVehicle(customer, scanner);
                        break;
                    case 2:
                        returnVehicle(scanner);
                        break;
                    case 3:
                        viewAllRentals();
                        break;
                    case 4:
                        quit = true;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
    }

    // Rent a vehicle
    private static void rentVehicle(Customer customer, Scanner scanner) {
        System.out.println("\nAvailable vehicles:");
        for (int i = 0; i < availableVehicles.size(); i++) {
            if (availableVehicles.get(i).isAvailable()) {
                System.out.println((i + 1) + ". " + availableVehicles.get(i).getModel() +
                        " (Registration: " + availableVehicles.get(i).getRegistrationNumber() + ")");
            }
        }

        System.out.print("Select a vehicle to rent: ");
        int vehicleChoice;
        try {
            vehicleChoice = scanner.nextInt() - 1;

            if (vehicleChoice < 0 || vehicleChoice >= availableVehicles.size()) {
                System.out.println("Invalid vehicle choice.");
                return;
            }

            Vehicle selectedVehicle = availableVehicles.get(vehicleChoice);

            if (!selectedVehicle.isAvailable()) {
                System.out.println("Sorry, that vehicle is not available.");
                return;
            }

            System.out.print("Enter number of days to rent: ");
            int days = scanner.nextInt();

            if (days <= 0) {
                System.out.println("Number of days must be greater than 0.");
                return;
            }

            RentalTransaction rentalTransaction = new RentalTransaction(customer, selectedVehicle, days);
            rentalTransactions.add(rentalTransaction);

            System.out.println("Vehicle rented successfully.");
            System.out.println(rentalTransaction);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Clear invalid input
        }
    }

    // Return a vehicle
    private static void returnVehicle(Scanner scanner) {
        System.out.println("\nRented vehicles:");

        if (rentalTransactions.isEmpty()) {
            System.out.println("No vehicles are currently rented.");
            return;
        }

        for (int i = 0; i < rentalTransactions.size(); i++) {
            System.out.println((i + 1) + ". " + rentalTransactions.get(i).toString());
        }

        System.out.print("Select a rental to return: ");
        int rentalChoice;
        try {
            rentalChoice = scanner.nextInt() - 1;

            if (rentalChoice < 0 || rentalChoice >= rentalTransactions.size()) {
                System.out.println("Invalid rental choice.");
                return;
            }

            RentalTransaction rentalTransaction = rentalTransactions.get(rentalChoice);
            rentalTransaction.returnVehicle();
            rentalTransactions.remove(rentalTransaction);

            System.out.println("Vehicle returned successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Clear invalid input
        }
    }

    // View all rentals
    private static void viewAllRentals() {
        if (rentalTransactions.isEmpty()) {
            System.out.println("No vehicles are currently rented.");
        } else {
            System.out.println("\nCurrently rented vehicles:");
            for (RentalTransaction transaction : rentalTransactions) {
                System.out.println(transaction);
            }
        }
    }
}
