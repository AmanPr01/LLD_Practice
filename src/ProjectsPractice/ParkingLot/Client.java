package ProjectsPractice.ParkingLot;

import ProjectsPractice.ParkingLot.Controllers.TicketController;
import ProjectsPractice.ParkingLot.DTOs.IssueTicketRequestDTO;
import ProjectsPractice.ParkingLot.DTOs.IssueTicketResponseDTO;
import ProjectsPractice.ParkingLot.Models.Ticket;
import ProjectsPractice.ParkingLot.Models.VehicleType;
import ProjectsPractice.ParkingLot.Repositories.GateRepository;
import ProjectsPractice.ParkingLot.Repositories.ParkingLotRepository;
import ProjectsPractice.ParkingLot.Repositories.TicketRepository;
import ProjectsPractice.ParkingLot.Repositories.VehicleRepository;
import ProjectsPractice.ParkingLot.Services.TicketService;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        // Create a Ticket
        IssueTicketRequestDTO requestDTO = new IssueTicketRequestDTO();
        requestDTO.setGateId(1234L);
        requestDTO.setVehicleOwnerName("Aman");
        requestDTO.setVehicleNumber("UP2024");
        requestDTO.setVehicleType(VehicleType.SUV);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Gate ID: ");
//        Long gateId = scanner.nextLong();
//        scanner.nextLine();
//
//        System.out.println("Enter Owner Name:");
//        String ownerName = scanner.nextLine();
//
//        System.out.println("Enter Vehicle ID:");
//        String vehicleId = scanner.nextLine();
//
//        System.out.println("Enter Vehicle Type (CAR, BIKE, SUV):");
//        VehicleType vehicleType = VehicleType.valueOf(scanner.nextLine().toUpperCase());
//
//        IssueTicketRequestDTO requestDTO = new IssueTicketRequestDTO();
//        requestDTO.setGateId(gateId);
//        requestDTO.setOwnerName(ownerName);
//        requestDTO.setVehicleId(vehicleId);
//        requestDTO.setVehicleType(vehicleType);

        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();


        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository
        );

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketResponseDTO responseDTO = ticketController.issueTicket(requestDTO);
        Ticket ticket = responseDTO.getTicket();

//        System.out.println("Ticket Issued:");
//        System.out.println("Ticket ID: " + ticket.getGeneratedAt().getId());
//        System.out.println("Owner Name: " + ticket.getVehicle().getOwnerName());
//        System.out.println("Vehicle ID: " + ticket.getVehicle().getVehicleNumber());
//        System.out.println("Vehicle Type: " + ticket.getVehicle().getVehicleType());
//        System.out.println("Issued At: " + ticket.getCreatedAt());

        if (ticket == null) {
            System.out.println("Failed to issue ticket. The ticket object is null.");
        } else {
            System.out.println("Ticket Issued:");
            System.out.println("Ticket ID: " + (ticket.getGeneratedAt() != null ? ticket.getGeneratedAt().getId() : "N/A"));
            System.out.println("Owner Name: " + ticket.getVehicle().getOwnerName());
            System.out.println("Vehicle ID: " + ticket.getVehicle().getVehicleNumber());
            System.out.println("Vehicle Type: " + ticket.getVehicle().getVehicleType());
            System.out.println("Issued At: " + ticket.getEntryTime());
        }
    }
}
