package vehiclerental;

public class Car extends Vehicle {
    private boolean hasAirConditioning;

    public Car(String registrationNumber, String model, boolean hasAirConditioning) {
        super(registrationNumber, model);
        this.hasAirConditioning = hasAirConditioning;
    }

    public boolean hasAirConditioning() {
        return hasAirConditioning;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = 50.0;
        if (hasAirConditioning) {
            baseCost += 10;
        }
        return baseCost * days;
    }
}
