package com.finartz.ticketingapplication.mapper;

import java.io.Serializable;

public interface Mapper<E extends Serializable,D extends Serializable> {

    D toDTO(E entity);
    E toEntity(D dto);

}
