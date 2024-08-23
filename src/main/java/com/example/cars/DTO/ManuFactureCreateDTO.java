package com.example.cars.DTO;

import jakarta.validation.constraints.NotBlank;

public record ManuFactureCreateDTO(@NotBlank String name) {

}
