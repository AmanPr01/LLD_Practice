package ProjectsPractice.ParkingLot.Factory;

import ProjectsPractice.ParkingLot.Models.SpotAssignmentStrategyType;
import ProjectsPractice.ParkingLot.Strategies.CheapestSpotAssignmentStrategy;
import ProjectsPractice.ParkingLot.Strategies.NearestSpotAssignmentStrategy;
import ProjectsPractice.ParkingLot.Strategies.RandomSpotAssignmentStrategy;
import ProjectsPractice.ParkingLot.Strategies.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategyForType(SpotAssignmentStrategyType spotAssignmentStrategyType) {
        switch (spotAssignmentStrategyType) {
            case CHEAPEST -> {
                return new CheapestSpotAssignmentStrategy();
            }
            case NEAREST -> {
                return new NearestSpotAssignmentStrategy();
            }
        }
        return new RandomSpotAssignmentStrategy();
    }
}
