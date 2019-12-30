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
public class Ticket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String customerName;

    @Column(unique = true)
    private String seatNumber;

    @OneToOne
    private FlightInformation flightInformation;

}
