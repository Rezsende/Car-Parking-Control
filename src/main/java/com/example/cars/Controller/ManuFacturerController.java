package com.example.cars.Controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cars.DTO.ManuFactureCreateDTO;
import com.example.cars.Models.Manufacturer;
import com.example.cars.Repositories.ManuFacturerRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/manufacture")
public class ManuFacturerController {
    @Autowired
    ManuFacturerRepository manuFacturerRepository;

    @PostMapping
    public ResponseEntity<Manufacturer> saveManu(@RequestBody @Valid ManuFactureCreateDTO manufactureDto) {
        var manufacModel = new Manufacturer();
        BeanUtils.copyProperties(manufactureDto, manufacModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(manuFacturerRepository.save(manufacModel));
    }

    @GetMapping
    public ResponseEntity<List<Manufacturer>> getManufactorer() {
        return ResponseEntity.status(HttpStatus.OK).body(manuFacturerRepository.findAll());
    }

}
