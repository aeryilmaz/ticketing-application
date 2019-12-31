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
public class Route extends AbstractEntity {



    @OneToOne(cascade = {CascadeType.ALL})
    private Airport departure;

    @OneToOne(cascade = {CascadeType.ALL})
    private Airport arrival;
}
