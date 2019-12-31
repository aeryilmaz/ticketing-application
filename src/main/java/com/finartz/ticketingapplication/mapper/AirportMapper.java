package com.finartz.ticketingapplication.mapper;

import com.finartz.ticketingapplication.dto.AirportDTO;
import com.finartz.ticketingapplication.entity.Airport;
import org.springframework.stereotype.Component;

@Component
public class AirportMapper extends AbstractGenericMapper<Airport,AirportDTO> {

    @Override
    public AirportDTO toDTO(Airport entity) {
        AirportDTO dto = new AirportDTO();
        dto.setCountry(entity.getCountry());
        dto.setLocation(entity.getLocation());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public Airport toEntity(AirportDTO dto) {
        Airport entity = new Airport();
        entity.setCountry(dto.getCountry());
        entity.setLocation(dto.getLocation());
        entity.setName(dto.getName());
        return entity;
    }
}
