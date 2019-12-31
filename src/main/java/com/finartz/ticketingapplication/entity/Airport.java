package com.finartz.ticketingapplication.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Airport extends AbstractEntity {

    private String country;

    @OneToOne(cascade = {CascadeType.ALL})
    private Location location;


}
