package com.finartz.ticketingapplication.dto;



import lombok.Data;

import java.io.Serializable;

@Data
public class CompanyDTO implements Serializable {

    private String name;

    private String country;
}
