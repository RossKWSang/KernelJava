package com.example.kernelJava.domain.schoolproject.business;

import com.example.kernelJava.domain.schoolproject.business.strategy.GradableStrategy;

public class PassFailGrade extends Grade{
    public PassFailGrade(int score, GradableStrategy gradableStrategy) {
        super(score, gradableStrategy);
    }
}
