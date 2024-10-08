package com.example.cars.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cars.Models.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {

}
