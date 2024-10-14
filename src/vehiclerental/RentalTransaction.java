package vehiclerental;

public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int daysRented;

    public RentalTransaction(Customer customer, Vehicle vehicle, int daysRented) {
        vehicle.setAvailable(false);  // Mark the vehicle as rented
    }

    public double getTotalCost() {
        return vehicle.calculateRentalCost(daysRented);
    }

    public void returnVehicle() {
        vehicle.setAvailable(true);  // Mark the vehicle as available
    }

    @Override
    public String toString() {
        return customer.getName() + " rented a " + vehicle.getModel() + " for " + daysRented
                + " days. Total cost: $" + getTotalCost();
    }
}
