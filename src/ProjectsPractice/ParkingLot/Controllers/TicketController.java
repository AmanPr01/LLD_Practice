package ProjectsPractice.ParkingLot.Controllers;

import ProjectsPractice.ParkingLot.DTOs.IssueTicketRequestDTO;
import ProjectsPractice.ParkingLot.DTOs.IssueTicketResponseDTO;
import ProjectsPractice.ParkingLot.DTOs.ResponseStatus;
import ProjectsPractice.ParkingLot.Exceptions.GateNotFoundException;
import ProjectsPractice.ParkingLot.Models.Ticket;
import ProjectsPractice.ParkingLot.Services.TicketService;

public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO) {
        IssueTicketResponseDTO  responseDTO = new IssueTicketResponseDTO();
        try {
            Ticket ticket = ticketService.issueTicket(
                    requestDTO.getGateId(),
                    requestDTO.getVehicleNumber(),
                    requestDTO.getVehicleOwnerName(),
                    requestDTO.getVehicleType()
            );

            responseDTO.setTicket(ticket);
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);

        } catch(GateNotFoundException gateNotFoundException) {
            gateNotFoundException.getMessage();
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }
}
