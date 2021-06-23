package com.bjit.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="division")
public class Division implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JsonIgnoreProperties(value = "weathers" , allowSetters = true)
    private Weather weather;

    @ManyToOne
    @JsonIgnoreProperties(value = "weathers" , allowSetters = true)
    private System sys;

}
