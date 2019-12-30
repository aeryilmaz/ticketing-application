package com.finartz.ticketingapplication.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class FlightInformation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private Integer customerSize;

    @OneToOne(fetch = FetchType.LAZY)
    private Route route;

    @OneToOne(fetch = FetchType.LAZY)
    private Company company;




}