package com.finartz.ticketingapplication.controller;

import com.finartz.ticketingapplication.dto.AirportDTO;
import com.finartz.ticketingapplication.service.IAirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("airports")
public class AirportController {

    @Autowired
    private IAirportService airportService;

    @PostMapping
    public ResponseEntity<AirportDTO> save(@RequestBody AirportDTO airportDTO){
        return ResponseEntity.ok(airportService.save(airportDTO));
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<AirportDTO>> search(@PathVariable(value = "name", required = true) String name){
        return ResponseEntity.ok(airportService.findByNameContaining(name));
    }

}
