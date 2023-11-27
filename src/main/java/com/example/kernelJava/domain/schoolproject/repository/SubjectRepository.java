package com.example.kernelJava.domain.schoolproject.repository;

import com.example.kernelJava.domain.schoolproject.db.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Subject findByName(String name);
}
