package dzhadyrassyn.coding.challenges;

import java.util.Map;

public class ParkingManagerFacade {

    private Parking parking;

    public Ticket parkVehicle(Vehicle vehicle) {
        Ticket ticket = new Ticket(System.currentTimeMillis());
        ticket.setVehicle(vehicle);

//        parking
//        List<Floor> floors = parking.floors;
//        floors.stream().anyMatch(it -> it.parkingSpaces.stream().anyMatch(ps -> ps.isAvailable() && ps.))
        return ticket;
    }

    public double releaseVehicle(Ticket ticket) {
        return ticket.countCost();
    }

    public Map<Floor, Map<VehicleType, Integer>> getAvailableSlots() {

        return Map.of();
    }
}
