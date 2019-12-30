package com.finartz.ticketingapplication.dto;

import lombok.Data;


import java.io.Serializable;

@Data
public class TicketDTO implements Serializable {

    private String customerName;

    private String seatNumber;

    private FlightInformationDTO flightInformation;

}
