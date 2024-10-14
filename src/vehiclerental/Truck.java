package vehiclerental;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String registrationNumber, String model, double loadCapacity) {
        super(registrationNumber, model);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = 100.0;
        if (loadCapacity > 1000) {
            baseCost += 50;
        }
        return baseCost * days;
    }
}
