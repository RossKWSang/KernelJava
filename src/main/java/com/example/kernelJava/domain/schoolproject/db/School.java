package com.example.kernelJava.domain.schoolproject.db;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private static String name = "SilverBell School";
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Student> students;
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Subject> subjects;
}