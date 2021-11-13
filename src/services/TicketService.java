package services;

import models.ParkingSpot;
import models.Ticket;
import models.Vehicle;
import repositories.TicketRepository;

import java.util.Date;

public class TicketService {
    TicketRepository ticketRepository = new TicketRepository();

    public Ticket createTicket(Vehicle vehicle, ParkingSpot spot) {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(spot);
        Ticket savedTicket = ticketRepository.save(ticket);
        return savedTicket;
    }
}
