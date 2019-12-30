package com.finartz.ticketingapplication.dto;


import lombok.Data;

import java.io.Serializable;


@Data
public class RouteDTO implements Serializable {

    private AirportDTO departure;
    private AirportDTO arrival;

}
