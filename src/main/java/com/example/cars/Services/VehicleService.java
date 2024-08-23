package com.example.cars.Services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.cars.DTO.CreateVeihicleDTO;
import com.example.cars.Models.Vehicle;
import com.example.cars.Repositories.ModelRepository;
import com.example.cars.Repositories.VehicleRepository;

import ch.qos.logback.core.model.Model;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VehicleService {
    private final VehicleRepository repository;
    private final ModelRepository modelrepository;

    public List<Vehicle> list() {
        return repository.findAll();
    }

    public Vehicle getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Vehicle not found"));
    }

    public Vehicle create(CreateVeihicleDTO data) {

        var model = modelrepository.findById(data.getModelId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Vehicle not found"));
        var vehicle = new Vehicle(
                data.getKilometers(),
                data.getColor(),
                data.getDescription(),
                data.getYear(),
                model);

        repository.save(vehicle);
        return vehicle;
    }

    public Vehicle update(Vehicle vehicle, Long id) {
        return null;
    }

    public void deleteById(Long id) {

    }

}
