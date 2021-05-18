package com.example.repo;

import com.example.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {

    List<Vehicle> getByTypeLike(String type);
}
