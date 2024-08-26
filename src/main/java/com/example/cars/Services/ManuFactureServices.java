package com.example.cars.Services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.cars.Models.Manufacturer;
import com.example.cars.Repositories.ManuFacturerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ManuFactureServices {

    private final ManuFacturerRepository manuFacturerRepository;

    public List<Manufacturer> listManufactureService() {
        return manuFacturerRepository.findAll();
    }
}
