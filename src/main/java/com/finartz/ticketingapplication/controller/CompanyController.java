package com.finartz.ticketingapplication.controller;

import com.finartz.ticketingapplication.dto.CompanyDTO;
import com.finartz.ticketingapplication.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("companies")
public class CompanyController {

    @Autowired
    private ICompanyService companyService;

    @PostMapping
    public ResponseEntity<CompanyDTO> save(@RequestBody(required = true) CompanyDTO companyDTO){
        return ResponseEntity.ok(companyService.save(companyDTO));
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<CompanyDTO>> search(@PathVariable(value = "name", required = true) String name){
       return ResponseEntity.ok(companyService.findByNameContaining(name));
    }


}
