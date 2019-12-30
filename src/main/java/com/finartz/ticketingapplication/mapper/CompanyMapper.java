package com.finartz.ticketingapplication.mapper;

import com.finartz.ticketingapplication.dto.CompanyDTO;
import com.finartz.ticketingapplication.entity.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapper implements Mapper<Company, CompanyDTO> {
    @Override
    public CompanyDTO toDTO(Company entity) {
        CompanyDTO dto = new CompanyDTO();
        dto.setCountry(entity.getCountry());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public Company toEntity(CompanyDTO dto) {
        Company entity = new Company();
        entity.setCountry(dto.getCountry());
        entity.setName(dto.getName());
        return entity;
    }
}
