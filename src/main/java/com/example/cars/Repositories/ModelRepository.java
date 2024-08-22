package com.example.cars.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cars.Models.Model;

public interface ModelRepository extends JpaRepository<Model, Long> {

}
