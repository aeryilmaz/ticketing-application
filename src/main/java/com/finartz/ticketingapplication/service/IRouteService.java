package com.finartz.ticketingapplication.service;

import com.finartz.ticketingapplication.dto.RouteDTO;
import com.finartz.ticketingapplication.entity.Route;

import java.util.List;

public interface IRouteService {
    RouteDTO save(RouteDTO routeDTO);
    List<RouteDTO> findByNameContaining(String name);

}
