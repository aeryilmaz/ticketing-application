package com.finartz.ticketingapplication.controller;


import com.finartz.ticketingapplication.dto.FlightInformationDTO;
import com.finartz.ticketingapplication.service.interfaces.IFlightInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("flights")
public class FlightInformationController {

    @Autowired
    private IFlightInformationService flightInformationService;

    @PostMapping
    public ResponseEntity<FlightInformationDTO> save(@RequestBody(required = true) FlightInformationDTO flightInformationDTO){
        return ResponseEntity.ok(flightInformationService.save(flightInformationDTO));
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<FlightInformationDTO>> search(@PathVariable(value = "name", required = true) String name){
        return ResponseEntity.ok(flightInformationService.findByNameContaining(name));
    }


}
