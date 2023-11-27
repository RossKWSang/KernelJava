package com.example.kernelJava.domain.schoolproject.business.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SubjectGradeDTO {
    private String studentName;
    private Long studentId;
    private String majorSubject;
    private int score;
    private String grade;
}
