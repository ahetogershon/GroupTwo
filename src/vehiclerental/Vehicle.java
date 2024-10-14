package vehiclerental;

public abstract class Vehicle {
    private String registrationNumber;
    private String model;
    private boolean isAvailable;

    public Vehicle(String registrationNumber, String model) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.isAvailable = true;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateRentalCost(int days);
}
