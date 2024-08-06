package ProjectsPractice.ParkingLot.Exceptions;

public class VehicleNotFoundException extends Exception {
    public VehicleNotFoundException() {
        super("Vehicle not found");
    }
}
