package com.finartz.ticketingapplication.mapper;

import com.finartz.ticketingapplication.dto.GenericDTO;
import com.finartz.ticketingapplication.entity.GenericEntity;


public interface Mapper<E extends GenericEntity, D extends GenericDTO> {

    D toDTO(E entity);
    E toEntity(D dto);

}
