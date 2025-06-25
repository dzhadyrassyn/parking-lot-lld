package dzhadyrassyn.coding.challenges;

public class ParkingSpace {

    private boolean isAvailable;
    private final VehicleType supportedVehicleType;

    public ParkingSpace(VehicleType supportedVehicleType) {
        isAvailable = true;
        this.supportedVehicleType = supportedVehicleType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return isAvailable && supportedVehicleType == vehicle.getType();
    }

    public void park() {
        this.isAvailable = false;
    }

    public void free() {
        this.isAvailable = true;
    }

    public VehicleType getSupportedVehicle() {
        return this.supportedVehicleType;
    }
}
