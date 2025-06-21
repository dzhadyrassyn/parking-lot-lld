package dzhadyrassyn.coding.challenges;

public class ParkingLotMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Parking Lot");

        ParkingManagerFacade parkingManager = new ParkingManagerFacade();
        parkingManager.parkVehicle(new Car("123-CAR"));
        parkingManager.parkVehicle(new Motorcycle("123-MOTORCYCLE"));
        parkingManager.parkVehicle(new Truck("123-TRUCK"));

        System.out.println(parkingManager.getAvailableSlots());
    }
}
