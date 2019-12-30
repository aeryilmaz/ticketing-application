package com.finartz.ticketingapplication.repository;

import com.finartz.ticketingapplication.entity.Airport;
import org.springframework.data.repository.CrudRepository;

public interface IAirportRepository extends CrudRepository<Airport,Long> {
}
