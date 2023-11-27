package com.example.kernelJava.domain.schoolproject.db;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Getter
@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Student student;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Subject subject;
    private Integer subjectMark;
}
