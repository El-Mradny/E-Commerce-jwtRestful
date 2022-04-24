package com.example.demo.repository;

import com.example.demo.model.Normal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NormalRepository extends JpaRepository<Normal, Long> {
}