package com.finartz.ticketingapplication.service;


import com.finartz.ticketingapplication.dto.AirportDTO;

import java.util.List;

public interface IAirportService {

    AirportDTO save(AirportDTO airportDTO);
    List<AirportDTO> findByNameContaining(String name);
}
