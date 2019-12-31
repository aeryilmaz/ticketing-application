package com.finartz.ticketingapplication.dto;

import com.finartz.ticketingapplication.entity.Location;
import lombok.Data;


import java.io.Serializable;

@Data
public class AirportDTO extends AbstractDTO{

    private String country;

    private Location location;
}
