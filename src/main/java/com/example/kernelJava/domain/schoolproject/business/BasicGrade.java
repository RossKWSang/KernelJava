package com.example.kernelJava.domain.schoolproject.business;

import com.example.kernelJava.domain.schoolproject.business.strategy.GradableStrategy;

public class BasicGrade extends Grade{
    public BasicGrade(int score, GradableStrategy gradableStrategy) {
        super(score, gradableStrategy);
    }
}
