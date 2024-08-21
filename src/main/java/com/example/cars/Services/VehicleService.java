package com.example.cars.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cars.Models.Vehicle;
import com.example.cars.Repositories.VehicleRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VehicleService {
    private final VehicleRepository repository;

    public List<Vehicle> list() {
        return repository.findAll();
    }

    public Vehicle getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Vehicle not found"));
    }

    public Vehicle create(Vehicle vehicle) {
        return null;
    }

    public Vehicle update(Vehicle vehicle, Long id) {
        return null;
    }

    public void deleteById(Long id) {

    }

}
