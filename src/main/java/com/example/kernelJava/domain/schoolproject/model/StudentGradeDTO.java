package com.example.kernelJava.domain.schoolproject.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StudentGradeDTO {
    private String subjectName;
    private Long subjectId;
    private String majorSubject;
    private int score;
    private String grade;
}
