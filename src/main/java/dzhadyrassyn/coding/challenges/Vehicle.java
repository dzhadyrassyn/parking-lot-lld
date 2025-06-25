package dzhadyrassyn.coding.challenges;

public abstract class Vehicle {

    private String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public abstract VehicleType getType();

    public String getLicensePlate() {
        return licensePlate;
    }
}
