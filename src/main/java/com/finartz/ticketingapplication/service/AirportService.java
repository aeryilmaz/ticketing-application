package com.finartz.ticketingapplication.service;

import com.finartz.ticketingapplication.dto.AirportDTO;
import com.finartz.ticketingapplication.entity.Airport;
import com.finartz.ticketingapplication.mapper.AirportMapper;
import com.finartz.ticketingapplication.repository.IAirportRepository;
import com.finartz.ticketingapplication.service.interfaces.IAirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportService implements IAirportService {

    @Autowired
    private AirportMapper airportMapper;

    @Autowired
    private IAirportRepository repository;

    @Override
    public AirportDTO save(AirportDTO airportDTO) {
        Airport airport = repository.save(airportMapper.toEntity(airportDTO));
        return airportMapper.toDTO(airport);
    }

    @Override
    public List<AirportDTO> findByNameContaining(String name) {
        List<AirportDTO> airportDTOS = new ArrayList<>();
        List<Airport> airports = repository.findByNameContaining(name);
        for(Airport airport : airports)
            airportDTOS.add(airportMapper.toDTO(airport));
        return airportDTOS;
    }
}
