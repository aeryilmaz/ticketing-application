package com.finartz.ticketingapplication.service.interfaces;

import com.finartz.ticketingapplication.dto.FlightInformationDTO;

import java.util.List;

public interface IFlightInformationService {

    FlightInformationDTO save(FlightInformationDTO flightInformationDTO);
    List<FlightInformationDTO> findByNameContaining(String name);

}
