package com.example.kernelJava.domain.schoolproject.repository;

import com.example.kernelJava.domain.schoolproject.db.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByName(String name);
}
