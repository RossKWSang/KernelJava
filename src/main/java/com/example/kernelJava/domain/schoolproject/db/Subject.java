package com.example.kernelJava.domain.schoolproject.db;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class Subject {
    @Id
    private Long id;
    private String name;
    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
    private List<Score> scores;
    @ManyToOne
    private School school;
}

