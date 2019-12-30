package com.finartz.ticketingapplication.service;

import com.finartz.ticketingapplication.dto.RouteDTO;
import com.finartz.ticketingapplication.entity.Route;
import com.finartz.ticketingapplication.mapper.RouteMapper;
import com.finartz.ticketingapplication.repository.IRouteRepository;
import com.finartz.ticketingapplication.service.interfaces.IRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteService implements IRouteService {

    @Autowired
    private IRouteRepository repository;

    @Autowired
    private RouteMapper routeMapper;

    @Override
    public RouteDTO save(RouteDTO routeDTO) {
        Route route = repository.save(routeMapper.toEntity(routeDTO));
        return routeMapper.toDTO(route);
    }

    @Override
    public List<RouteDTO> findByNameContaining(String name) {
        List<RouteDTO> routeDTOS = new ArrayList<>();
        List<Route> routes = repository.findByNameContaining(name);
        for(Route route : routes)
            routeDTOS.add(routeMapper.toDTO(route));
        return routeDTOS;
    }
}
