package com.example.kernelJava.domain.schoolproject.db;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private MajorSubjectName majorSubject;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Score> scores;

    @ManyToOne
    private School school;
}
