package com.finartz.ticketingapplication.service;


import com.finartz.ticketingapplication.dto.CompanyDTO;

import java.util.List;

public interface ICompanyService {

    CompanyDTO save(CompanyDTO companyDTO);
    List<CompanyDTO> findByNameContaining(String name);

}
