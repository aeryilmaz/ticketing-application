package com.finartz.ticketingapplication.repository;

import com.finartz.ticketingapplication.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAirportRepository extends IGenericRepository<Airport> {

    List<Airport> findByNameContaining(String name);
    Airport findByName(String name);

}
