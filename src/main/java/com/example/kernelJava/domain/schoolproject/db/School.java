package com.example.kernelJava.domain.schoolproject.db;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private static String name = "SilverBell School";

    @OneToMany
    private List<Student> students;
}