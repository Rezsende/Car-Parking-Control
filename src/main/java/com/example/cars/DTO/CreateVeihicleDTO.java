package com.example.cars.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateVeihicleDTO {
    private Integer kilometers;
    private String color;
    private String description;
    private Integer year;
    private Long modelId;
}
