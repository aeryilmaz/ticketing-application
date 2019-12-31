package com.finartz.ticketingapplication.entity;

import java.io.Serializable;

public interface GenericEntity extends Serializable {

    Long getId();
    void setId(Long id);
    String getName();
    void setName(String name);

}
