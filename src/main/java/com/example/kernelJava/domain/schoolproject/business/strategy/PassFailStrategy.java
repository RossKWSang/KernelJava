package com.example.kernelJava.domain.schoolproject.business.strategy;

public class PassFailStrategy implements GradableStrategy{
    @Override
    public String getGrade(int score) {
        if(score >= 70) return "P";
        else return "F";
    }
}
