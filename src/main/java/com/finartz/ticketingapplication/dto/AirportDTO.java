package com.finartz.ticketingapplication.dto;

import com.finartz.ticketingapplication.entity.Location;
import lombok.Data;


import java.io.Serializable;

@Data
public class AirportDTO implements Serializable {

    private String name;

    private String country;

    private Location location;
}
