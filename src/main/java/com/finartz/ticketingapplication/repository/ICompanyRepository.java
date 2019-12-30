package com.finartz.ticketingapplication.repository;

import com.finartz.ticketingapplication.entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompanyRepository extends CrudRepository<Company,Long> {

    

}
