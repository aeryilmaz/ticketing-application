package com.finartz.ticketingapplication.service;

import com.finartz.ticketingapplication.dto.CompanyDTO;
import com.finartz.ticketingapplication.entity.Company;
import com.finartz.ticketingapplication.mapper.CompanyMapper;
import com.finartz.ticketingapplication.repository.ICompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService implements ICompanyService{
    
    @Autowired
    private CompanyMapper companyMapper;
    
    @Autowired
    private ICompanyRepository repository;
    
    @Override
    public CompanyDTO save(CompanyDTO companyDTO) {
        Company company = repository.save(companyMapper.toEntity(companyDTO));
        return companyMapper.toDTO(company);
    }

    @Override
    public List<CompanyDTO> findByNameContaining(String name) {
        List<CompanyDTO> companyDTOS = new ArrayList<>();
        List<Company> companies = repository.findByNameContaining(name);
        for(Company company : companies)
            companyDTOS.add(companyMapper.toDTO(company));
        return companyDTOS;
    }
}
