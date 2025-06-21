package dzhadyrassyn.coding.challenges;

public class Ticket {

    long startTime;
    Vehicle vehicle;

    public Ticket(long startTime) {
        this.startTime = startTime;
    }

    public double countCost() {
        return 0L;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
