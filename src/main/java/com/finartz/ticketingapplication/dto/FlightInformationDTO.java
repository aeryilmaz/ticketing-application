package com.finartz.ticketingapplication.dto;


import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class FlightInformationDTO extends AbstractDTO {

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private String name;

    private Integer customerSize;

    private RouteDTO route;

    private CompanyDTO company;
}
