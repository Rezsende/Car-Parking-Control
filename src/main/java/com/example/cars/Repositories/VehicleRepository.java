package com.example.cars.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cars.Models.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}