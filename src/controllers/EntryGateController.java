package controllers;

import dtos.GetTicketDTO;
import models.DisplayBoard;
import models.ParkingSpot;
import models.Ticket;
import models.Vehicle;
import services.ParkingSpotService;
import services.SlotAllocationService;
import services.TicketService;

public class EntryGateController {
    SlotAllocationService slotAllocationService = new SlotAllocationService();
    ParkingSpotService parkingSpotService = new ParkingSpotService();
    TicketService ticketService = new TicketService();

    DisplayBoard getDisplayBoard() {
        return null;
    }

    public GetTicketDTO getTicket(Vehicle vehicle) {
        ParkingSpot spot = slotAllocationService
                .allocateSlot(vehicle.getType());
        parkingSpotService.markSpotBooked(spot);
        Ticket ticket = ticketService.createTicket(vehicle, spot);
        GetTicketDTO dto = new GetTicketDTO();
        dto.setTicket(ticket);
        return dto;
    }
}


// Dependency Inversion: No 2 concrete classes should depend
// on each other.
// They should depend on each other via an interface.