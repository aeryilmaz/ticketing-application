package com.finartz.ticketingapplication.dto;


import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class FlightInformationDTO implements Serializable {

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private Integer customerSize;

    private RouteDTO route;

    private CompanyDTO company;
}
