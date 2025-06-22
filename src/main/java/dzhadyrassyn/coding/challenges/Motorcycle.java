package dzhadyrassyn.coding.challenges;

public class Motorcycle extends Vehicle {

    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }
}
