package ProjectsPractice.ParkingLot.Services;

import ProjectsPractice.ParkingLot.Exceptions.GateNotFoundException;
import ProjectsPractice.ParkingLot.Factory.SpotAssignmentStrategyFactory;
import ProjectsPractice.ParkingLot.Models.*;
import ProjectsPractice.ParkingLot.Repositories.GateRepository;
import ProjectsPractice.ParkingLot.Repositories.ParkingLotRepository;
import ProjectsPractice.ParkingLot.Repositories.TicketRepository;
import ProjectsPractice.ParkingLot.Repositories.VehicleRepository;
import ProjectsPractice.ParkingLot.Strategies.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private final GateRepository gateRepository;
    private final VehicleRepository vehicleRepository;
    private final ParkingLotRepository parkingLotRepository;
    private final TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(Long gateId,
                              String vehicleNumber,
                              String vehicleOwnerName,
                              VehicleType vehicleType) throws GateNotFoundException {

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        // Get the gate object from the gateId.
        Optional<Gate> optionalGate = gateRepository.findGateById(gateId);

        if (optionalGate.isEmpty()) {
            throw new GateNotFoundException("Invalid gateId: " + gateId);
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());

        // Get the vehicle object with the vehicleNumber, if it is not present then save it on DB.
        Optional<Vehicle> optionalVehicle = vehicleRepository.findVehicleByVehicleNumber(vehicleNumber);
        Vehicle savedvehicle = null;

        if (optionalVehicle.isEmpty()) {
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(vehicleOwnerName);
            savedvehicle = vehicleRepository.save(vehicle);
        }
        else {
            savedvehicle = optionalVehicle.get();
        }

        ticket.setVehicle(savedvehicle);

        // Assign the spot.
        ParkingLot parkingLot = parkingLotRepository.getParkingLotByGateId(gateId);
        SpotAssignmentStrategyType spotAssignmentStrategyType = parkingLot.getSpotAssignmentStrategyType();

        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.getSpotAssignmentStrategyForType(spotAssignmentStrategyType);

        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(vehicleType, gate);
        ticket.setParkingSpot(parkingSpot);

        ticket.setNumber("TICKET_" + gateId + "_" + ticket.getEntryTime().getTime());

        ticketRepository.save(ticket);

        return ticket;
    }
}



























