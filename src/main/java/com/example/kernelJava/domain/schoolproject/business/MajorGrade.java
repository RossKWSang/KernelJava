package com.example.kernelJava.domain.schoolproject.business;

import com.example.kernelJava.domain.schoolproject.business.strategy.GradableStrategy;

public class MajorGrade extends Grade{
    public MajorGrade(int score, GradableStrategy gradableStrategy) {
        super(score, gradableStrategy);
    }
}
