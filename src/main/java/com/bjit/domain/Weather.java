package com.bjit.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="weather")
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private Double temp;

    @Column(name="feels_like")
    private Double feelsLike;

    @Column(name="temp_min")
    private Double tempMin;

    @Column(name="temp_max")
    private Double tempMax;

    private int pressure;

    private int humidity;

    @Column(name="sea_level")
    private int seaLevel;

    @Column(name="grnd_level")
    private int grndLevel;

}
