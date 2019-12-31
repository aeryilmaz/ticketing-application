package com.finartz.ticketingapplication.dto;

import lombok.Data;


import java.io.Serializable;

@Data
public class TicketDTO extends AbstractDTO {

    private String customerName;

    private String seatNumber;

    private FlightInformationDTO flightInformation;

}
