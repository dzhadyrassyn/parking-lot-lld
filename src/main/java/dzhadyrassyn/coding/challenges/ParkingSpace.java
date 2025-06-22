package dzhadyrassyn.coding.challenges;

public class ParkingSpace {

    private Vehicle currentVehicle;
    private boolean isAvailable;
    private VehicleType supportedVehicleType;

    public ParkingSpace(VehicleType supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return isAvailable && supportedVehicleType == vehicle.getType();
    }

    public void park(Vehicle vehicle) {
        this.isAvailable = true;
        this.currentVehicle = vehicle;
    }

    public void leave() {
        this.isAvailable = false;
        currentVehicle = null;
    }
}
