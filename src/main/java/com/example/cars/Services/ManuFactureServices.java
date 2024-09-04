package com.example.cars.Services;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
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

    public Manufacturer getById(Long id) {
        return manuFacturerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Manufacturer not found"));
    }

}
