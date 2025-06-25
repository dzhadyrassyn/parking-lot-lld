package dzhadyrassyn.coding.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ParkingManagerFacade {

    private final Parking parking;
    private final Map<String, ParkingSpace> licenseToParkingSpaceMap = new HashMap<>();
    private final Map<String, Ticket> activeTickets = new HashMap<>();

    public ParkingManagerFacade(Parking parking) {
        this.parking = parking;
    }

    public Ticket parkVehicle(Vehicle vehicle) {

        Optional<ParkingSpace> slot = parking.findSlot(vehicle);

        if (slot.isEmpty()) {
            throw new IllegalArgumentException("No slot available for vehicle " + vehicle.getType());
        }

        slot.get().park(vehicle);

        Ticket ticket = new Ticket(System.currentTimeMillis());
        ticket.setVehicle(vehicle);

        licenseToParkingSpaceMap.put(vehicle.getLicensePlate(), slot.get());
        activeTickets.put(vehicle.getLicensePlate(), ticket);

        return ticket;
    }

    public double releaseVehicle(Ticket ticket) {

        Vehicle vehicle = ticket.getVehicle();
        ParkingSpace releasedParkingSpace = licenseToParkingSpaceMap.remove(vehicle.getLicensePlate());
        releasedParkingSpace.reset();

        ticket.setEndTime(System.currentTimeMillis());

        activeTickets.remove(vehicle.getLicensePlate());

        return ticket.countCost();
    }

    public Map<Floor, Map<VehicleType, Integer>> getAvailableSlots() {

        return parking.getFloors().stream().collect(Collectors.toMap(
                floor -> floor,
                floor -> {
                    Map<VehicleType, Integer> typeCount = new HashMap<>();
                    for (ParkingSpace parkingSpace : floor.getParkingSpaces()) {
                        if (parkingSpace.isAvailable()) {
                            typeCount.merge(parkingSpace.getSupportedVehicle(), 1, Integer::sum);
                        }
                    }
                    return typeCount;
                }
        ));
    }
}
