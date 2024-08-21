
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

@RestController
@RequestMapping("/vehicles")
class VehicleController {
    @GetMapping
    public List<Vehicle> index() {
        return null;
    }

    @GetMapping("/{id}")
    public Vehicle show(@PathVariable("id") Long id) {
        return null;
    }

    @PostMapping
    public Vehicle create(Vehicle vehicle) {
        return null;
    }

    @PutMapping("/{id}")
    public Vehicle update(@PathVariable("id") Long id, Vehicle vehicle) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id, Vehicle vehicle) {

    }
}