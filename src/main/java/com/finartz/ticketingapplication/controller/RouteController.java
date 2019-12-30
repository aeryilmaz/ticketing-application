package com.finartz.ticketingapplication.controller;

import com.finartz.ticketingapplication.dto.RouteDTO;
import com.finartz.ticketingapplication.service.interfaces.IRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("routes")
public class RouteController {

    @Autowired
    private IRouteService routeService;

    @PostMapping
    public ResponseEntity<RouteDTO> save(@RequestBody(required = true) RouteDTO routeDTO){
        return ResponseEntity.ok(routeService.save(routeDTO));
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<RouteDTO>> search(@PathVariable(value = "name", required = true) String name){
        return ResponseEntity.ok(routeService.findByNameContaining(name));
    }

}
