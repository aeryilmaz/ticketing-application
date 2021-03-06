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
public class Ticket extends AbstractEntity {

    @Column(unique = true)
    private String seatNumber;

    @OneToOne(cascade = {CascadeType.ALL})
    private FlightInformation flightInformation;

}
