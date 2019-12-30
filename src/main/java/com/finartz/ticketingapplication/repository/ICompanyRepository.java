package com.finartz.ticketingapplication.repository;

import com.finartz.ticketingapplication.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICompanyRepository extends JpaRepository<Company,Long> {

    List<Company> findByNameContaining(String name);

}
