package dzhadyrassyn.coding.challenges;

public class ParkingSpace {

    private boolean isAvailable;
    private VehicleType supportedVehicleType;

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

    public void park(Vehicle vehicle) {
        this.isAvailable = false;
    }

    public void reset() {
        this.isAvailable = true;
    }

    public VehicleType getSupportedVehicle() {
        return this.supportedVehicleType;
    }
}
