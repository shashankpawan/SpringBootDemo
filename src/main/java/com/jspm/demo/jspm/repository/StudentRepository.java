package com.jspm.demo.jspm.repository;

// Repository (StudentRepository.java)
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspm.demo.jspm.model.Student;

@Repository // Optional, but good practice
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Add custom queries if needed (e.g., findByMajor(String major))
}