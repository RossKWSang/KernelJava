package com.example.kernelJava.domain.customerservice.algorithm;

import com.example.kernelJava.domain.customerservice.algorithm.strategy.ScheduleStrategy;

import java.util.List;

public class SjfSchedule extends Schedule{
    public SjfSchedule(ScheduleStrategy scheduleStrategy) {
        super(scheduleStrategy);
    }
    public void setIntegerList(List<List<Integer>> integerListInput) {
        super.setIntegerList(integerListInput);
    }
}
