package vehiclerental;

public class Bike extends Vehicle {
    private boolean hasHelmetIncluded;

    public Bike(String registrationNumber, String model, boolean hasHelmetIncluded) {
        super(registrationNumber, model);
        this.hasHelmetIncluded = hasHelmetIncluded;
    }

    public boolean hasHelmetIncluded() {
        return hasHelmetIncluded;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = 20.0;
        if (hasHelmetIncluded) {
            baseCost += 5;
        }
        return baseCost * days;
    }
}
