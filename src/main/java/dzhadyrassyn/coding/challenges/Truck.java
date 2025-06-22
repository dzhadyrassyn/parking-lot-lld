package dzhadyrassyn.coding.challenges;

public class Truck extends Vehicle {

    public Truck(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.TRUCK;
    }
}
