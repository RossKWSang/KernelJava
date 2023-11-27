package com.example.kernelJava.domain.schoolproject.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@Entity
public class Subject {
    @Id
    private Long id;
    private String name;
    private Integer gradeType;

    public Subject() {
    }
}

