package com.example.cars.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cars.Models.Manufacturer;
import org.springframework.stereotype.Repository;

@Repository
public interface ManuFacturerRepository extends JpaRepository<Manufacturer, Long> {

}
