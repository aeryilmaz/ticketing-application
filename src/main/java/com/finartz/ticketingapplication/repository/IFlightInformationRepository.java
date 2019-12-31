package com.finartz.ticketingapplication.repository;

import com.finartz.ticketingapplication.entity.FlightInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFlightInformationRepository extends IGenericRepository<FlightInformation> {

    List<FlightInformation> findByNameContaining(String name);
    FlightInformation findByName(String name);

}
