package com.example.demo.repository;

import com.example.demo.model.Tube;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TubeRepository extends JpaRepository<Tube, Long> {
}