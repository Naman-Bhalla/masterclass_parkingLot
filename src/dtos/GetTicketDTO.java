package dtos;

import models.Ticket;

enum Status {
    ERROR,
    SUCCESS,
}

public class GetTicketDTO {
    Status status;
    Ticket ticket;
}
