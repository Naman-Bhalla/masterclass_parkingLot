package controllers;

import dtos.GetTicketDTO;
import models.DisplayBoard;
import models.ParkingSpot;
import models.Ticket;
import models.Vehicle;
import services.EntryGateService;
import services.ParkingSpotService;
import services.SlotAllocationService;
import services.TicketService;

public class EntryGateController {
    SlotAllocationService slotAllocationService = new SlotAllocationService();
    ParkingSpotService parkingSpotService = new ParkingSpotService();
    TicketService ticketService = new TicketService();
    EntryGateService entryGateService = new EntryGateService();

    DisplayBoard getDisplayBoard() {
        return null;
    }

    public GetTicketDTO getTicket(Vehicle vehicle) {
        return entryGateService.getTicket(vehicle);
    }
}


// Dependency Inversion: No 2 concrete classes should depend
// on each other.
// They should depend on each other via an interface.
// Dependency Inversion violated
// Nopt singletons
// No persistence