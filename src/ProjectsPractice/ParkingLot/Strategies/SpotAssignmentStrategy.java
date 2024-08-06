package ProjectsPractice.ParkingLot.Strategies;

import ProjectsPractice.ParkingLot.Models.Gate;
import ProjectsPractice.ParkingLot.Models.ParkingSpot;
import ProjectsPractice.ParkingLot.Models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(VehicleType vehicleType, Gate gate);
}
