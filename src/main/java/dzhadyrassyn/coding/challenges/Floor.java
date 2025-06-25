package dzhadyrassyn.coding.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Floor {

    private final List<ParkingSpace> parkingSpaces = new ArrayList<>();

    public void addParkingSpace(ParkingSpace parkingSpace) {
        parkingSpaces.add(parkingSpace);
    }

    public Optional<ParkingSpace> getAvailableSlot(Vehicle vehicle) {
        return parkingSpaces.stream().filter(it -> it.canFitVehicle(vehicle)).findFirst();
    }

    public List<ParkingSpace> getParkingSpaces() {
        return parkingSpaces;
    }
}
