package com.example.demo.repository;

import com.example.demo.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepostory extends JpaRepository<Staff, Integer> {
    
}
