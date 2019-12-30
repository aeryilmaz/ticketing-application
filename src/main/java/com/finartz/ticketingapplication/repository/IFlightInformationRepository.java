package com.finartz.ticketingapplication.repository;

import com.finartz.ticketingapplication.entity.FlightInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFlightInformationRepository extends JpaRepository<FlightInformation,Long> {

    List<FlightInformation> findByNameContaining(String name);

}
