package com.example.kernelJava.domain.customerservice.algorithm;

import com.example.kernelJava.domain.customerservice.algorithm.strategy.ScheduleStrategy;

import java.util.List;

public class Schedule {
    List<List<Integer>> integerList;
    private ScheduleStrategy scheduleStrategy;

    public Schedule(ScheduleStrategy scheduleStrategy) {
        this.scheduleStrategy = scheduleStrategy;
    }

    public void setIntegerList(List<List<Integer>> integerList) {
        this.integerList = integerList;
    }

    public int getDuration() {
        return scheduleStrategy.getDuration(integerList);
    }
}
