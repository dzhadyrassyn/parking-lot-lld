package dzhadyrassyn.coding.challenges;

import java.util.Map;

public class ParkingManagerFacade {

    Parking parking;

    public Ticket parkVehicle(Vehicle vehicle) {
        Ticket ticket = new Ticket(System.currentTimeMillis());
        ticket.setVehicle(vehicle);

        return ticket;
    }

    public double releaseVehicle(Ticket ticket) {
        return ticket.countCost();
    }

    public Map<Floor, Map<VehicleType, Integer>> getAvailableSlots() {

        return Map.of();
    }
}
