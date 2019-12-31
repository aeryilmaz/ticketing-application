package com.finartz.ticketingapplication.dto;



import lombok.Data;

import java.io.Serializable;

@Data
public class CompanyDTO extends AbstractDTO {

    private String name;

    private String country;
}
