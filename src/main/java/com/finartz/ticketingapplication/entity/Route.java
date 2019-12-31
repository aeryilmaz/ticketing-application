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
public class Route implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToOne(cascade = {CascadeType.ALL})
    private Airport departure;

    @OneToOne(cascade = {CascadeType.ALL})
    private Airport arrival;
}
