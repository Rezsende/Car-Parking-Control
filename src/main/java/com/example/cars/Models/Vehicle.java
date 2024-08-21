package com.example.cars.Models;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "kilometers")
    private Integer kilometers;
    @Column(name = "color", length = 150)
    private String color;
    @Column(name = "description", length = 150)
    private String description;
    @Column(name = "avalilavle")
    private Boolean avalilavle;
    @Column(name = "year")
    private Integer year;
    // muitos veiculos para um modelo
    @JoinColumn(name = "model_id")
    @ManyToOne
    private Model model;

}
