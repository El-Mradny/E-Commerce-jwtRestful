package com.example.demo.repository;

import com.example.demo.model.Shipping;
import com.example.demo.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Long> {
    List<Store> findByUserid(String id);
}