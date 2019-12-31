package com.finartz.ticketingapplication.repository;

import com.finartz.ticketingapplication.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRouteRepository extends IGenericRepository<Route> {

    List<Route> findByNameContaining(String name);
    Route findByName(String name);

}
