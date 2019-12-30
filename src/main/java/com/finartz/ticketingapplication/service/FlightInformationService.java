package com.finartz.ticketingapplication.service;

import com.finartz.ticketingapplication.dto.FlightInformationDTO;
import com.finartz.ticketingapplication.entity.FlightInformation;
import com.finartz.ticketingapplication.mapper.FlightInformationMapper;
import com.finartz.ticketingapplication.repository.IFlightInformationRepository;
import com.finartz.ticketingapplication.service.interfaces.IFlightInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightInformationService implements IFlightInformationService {

    @Autowired
    private IFlightInformationRepository flightInformationRepository;

    @Autowired
    private FlightInformationMapper flightInformationMapper;

    @Override
    public FlightInformationDTO save(FlightInformationDTO flightInformationDTO) {
        FlightInformation flightInformation = flightInformationRepository.save(flightInformationMapper.toEntity(flightInformationDTO));
        return flightInformationMapper.toDTO(flightInformation);
    }

    @Override
    public List<FlightInformationDTO> findByNameContaining(String name) {
        List<FlightInformationDTO> flightInformationDTOS = new ArrayList<>();
        List<FlightInformation> flights =  flightInformationRepository.findByNameContaining(name);
        for(FlightInformation flightInformation : flights)
            flightInformationDTOS.add(flightInformationMapper.toDTO(flightInformation));
        return flightInformationDTOS;
    }
}
