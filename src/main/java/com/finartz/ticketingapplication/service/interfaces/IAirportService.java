package com.finartz.ticketingapplication.service.interfaces;


import com.finartz.ticketingapplication.dto.AirportDTO;

import java.util.List;

public interface IAirportService {

    AirportDTO save(AirportDTO airportDTO);
    List<AirportDTO> findByNameContaining(String name);
}
