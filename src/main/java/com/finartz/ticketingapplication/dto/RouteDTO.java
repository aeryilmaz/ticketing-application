package com.finartz.ticketingapplication.dto;


import lombok.Data;

import java.io.Serializable;


@Data
public class RouteDTO extends AbstractDTO {

    private String name;
    private AirportDTO departure;
    private AirportDTO arrival;

}
