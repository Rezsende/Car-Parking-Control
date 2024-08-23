package com.example.cars.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cars.Models.Manufacturer;

public interface ManuFacturerRepository extends JpaRepository<Manufacturer, Long> {

}
