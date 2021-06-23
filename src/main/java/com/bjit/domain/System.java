package com.bjit.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="weather")
public class System {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String country;
    private String sunset;
}
