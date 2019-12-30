package com.finartz.ticketingapplication.service.interfaces;

import com.finartz.ticketingapplication.dto.RouteDTO;

import java.util.List;

public interface IRouteService {
    RouteDTO save(RouteDTO routeDTO);
    List<RouteDTO> findByNameContaining(String name);

}
