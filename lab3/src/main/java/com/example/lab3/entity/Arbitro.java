package com.example.lab3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="arbitro")
@Getter
@Setter
public class Arbitro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idArbitro;
    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;
    @Column(name = "pais",nullable = false,length = 45)
    private String pais;
}
