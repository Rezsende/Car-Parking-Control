package com.example.cars.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cars.Models.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}