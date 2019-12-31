package com.finartz.ticketingapplication.dto;

public abstract class AbstractDTO implements GenericDTO {

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
