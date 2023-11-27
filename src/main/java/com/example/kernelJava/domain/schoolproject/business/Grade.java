package com.example.kernelJava.domain.schoolproject.business;

import com.example.kernelJava.domain.schoolproject.business.strategy.GradableStrategy;

public class Grade {
    private int score;
    private GradableStrategy gradableStrategy;
    public Grade(int score, GradableStrategy gradableStrategy) {
        this.score = score;
        this.gradableStrategy = gradableStrategy;
    }

    public String getGrade(){
        return gradableStrategy.getGrade(score);
    }
}
