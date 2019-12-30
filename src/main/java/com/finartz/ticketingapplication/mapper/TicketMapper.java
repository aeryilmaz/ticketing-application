package com.finartz.ticketingapplication.mapper;

import com.finartz.ticketingapplication.dto.TicketDTO;
import com.finartz.ticketingapplication.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;

public class TicketMapper implements Mapper<Ticket, TicketDTO> {

    @Autowired
    private FlightInformationMapper flightInformationMapper;

    @Override
    public TicketDTO toDTO(Ticket entity) {
        TicketDTO dto = new TicketDTO();
        dto.setCustomerName(entity.getCustomerName());
        dto.setSeatNumber(entity.getSeatNumber());
        dto.setFlightInformation(flightInformationMapper.toDTO(entity.getFlightInformation()));
        return dto;
    }

    @Override
    public Ticket toEntity(TicketDTO dto) {
        Ticket entity = new Ticket();
        entity.setCustomerName(dto.getCustomerName());
        entity.setSeatNumber(dto.getSeatNumber());
        entity.setFlightInformation(flightInformationMapper.toEntity(dto.getFlightInformation()));
        return entity;
    }
}
