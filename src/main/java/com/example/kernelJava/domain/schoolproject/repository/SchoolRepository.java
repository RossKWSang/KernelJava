package com.example.kernelJava.domain.schoolproject.repository;

import com.example.kernelJava.domain.schoolproject.db.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SchoolRepository extends JpaRepository<School, Long> {
    Optional<School> findById(Long id);
}
