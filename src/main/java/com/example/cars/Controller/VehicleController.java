
package com.example.cars.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.cars.Models.Vehicle;
import com.example.cars.Services.VehicleService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/vehicles")
@AllArgsConstructor
class VehicleController {
    private final VehicleService service;

    @GetMapping
    public List<Vehicle> index() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Vehicle show(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Vehicle create(Vehicle vehicle) {
        return service.create(vehicle);
    }

    @PutMapping("/{id}")
    public Vehicle update(@PathVariable("id") Long id, Vehicle vehicle) {
        return service.update(vehicle, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.deleteById(id);

    }
}