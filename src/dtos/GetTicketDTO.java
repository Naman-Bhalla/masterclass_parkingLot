package dtos;

import models.Ticket;

enum Status {
    ERROR,
    SUCCESS,
}

public class GetTicketDTO {
    Status status;
    Ticket ticket;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
