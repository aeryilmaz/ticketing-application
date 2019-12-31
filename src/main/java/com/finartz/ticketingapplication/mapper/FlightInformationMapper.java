package com.finartz.ticketingapplication.mapper;

import com.finartz.ticketingapplication.dto.FlightInformationDTO;
import com.finartz.ticketingapplication.entity.FlightInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlightInformationMapper extends AbstractGenericMapper<FlightInformation, FlightInformationDTO> {

    @Autowired
    private RouteMapper routeMapper;

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public FlightInformationDTO toDTO(FlightInformation entity) {
        FlightInformationDTO dto = new FlightInformationDTO();
        dto.setArrivalTime(entity.getArrivalTime());
        dto.setCustomerSize(entity.getCustomerSize());
        dto.setDepartureTime(entity.getDepartureTime());
        dto.setName(entity.getName());
        dto.setCompany(companyMapper.toDTO(entity.getCompany()));
        dto.setRoute(routeMapper.toDTO(entity.getRoute()));
        return dto;
    }

    @Override
    public FlightInformation toEntity(FlightInformationDTO dto) {
        FlightInformation entity = new FlightInformation();
        entity.setArrivalTime(dto.getArrivalTime());
        entity.setDepartureTime(dto.getDepartureTime());
        entity.setCustomerSize(entity.getCustomerSize());
        entity.setName(dto.getName());
        entity.setRoute(routeMapper.toEntity(dto.getRoute()));
        entity.setCompany(companyMapper.toEntity(dto.getCompany()));
        return entity;
    }
}
