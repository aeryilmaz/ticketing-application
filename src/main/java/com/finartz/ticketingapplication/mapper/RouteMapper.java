package com.finartz.ticketingapplication.mapper;

import com.finartz.ticketingapplication.dto.RouteDTO;
import com.finartz.ticketingapplication.entity.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RouteMapper implements Mapper<Route, RouteDTO> {

    @Autowired
    private AirportMapper airportMapper;

    @Override
    public RouteDTO toDTO(Route entity) {
        RouteDTO dto = new RouteDTO();
        dto.setName(entity.getName());
        dto.setArrival(airportMapper.toDTO(entity.getArrival()));
        dto.setDeparture(airportMapper.toDTO(entity.getDeparture()));
        return dto;
    }

    @Override
    public Route toEntity(RouteDTO dto) {
        Route entity = new Route();
        entity.setName(entity.getName());
        entity.setArrival(airportMapper.toEntity(dto.getArrival()));
        entity.setDeparture(airportMapper.toEntity(dto.getDeparture()));
        return entity;
    }
}
