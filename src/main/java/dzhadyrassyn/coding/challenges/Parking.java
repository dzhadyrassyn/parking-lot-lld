package dzhadyrassyn.coding.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Parking {

    private final List<Floor> floors = new ArrayList<>();

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public Optional<ParkingSpace> findSlot(Vehicle vehicle) {
        return floors.stream().flatMap(it -> it.getAvailableSlot(vehicle).stream()).findFirst();
    }
}
