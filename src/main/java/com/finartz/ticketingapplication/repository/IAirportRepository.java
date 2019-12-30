package com.finartz.ticketingapplication.repository;

import com.finartz.ticketingapplication.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAirportRepository extends JpaRepository<Airport,Long> {

    List<Airport> findByNameContaining(String name);

}
