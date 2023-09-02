package com.example.lab3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="estadio")
@Getter
@Setter
public class Estadio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstadio;
    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;
    @Column(name = "provincia",nullable = false,length = 45)
    private String provincia;
    @Column(name = "club",length = 45)
    private String club;




}
