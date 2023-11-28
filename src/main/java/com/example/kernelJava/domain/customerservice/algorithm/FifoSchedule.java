package com.example.kernelJava.domain.customerservice.algorithm;

import com.example.kernelJava.domain.customerservice.algorithm.strategy.ScheduleStrategy;

import java.util.List;

public class FifoSchedule extends Schedule{
    public FifoSchedule(ScheduleStrategy scheduleStrategy) {
        super(scheduleStrategy);
    }

    // 다른 메서드 등...

    public void setIntegerList(List<List<Integer>> integerListInput) {
        super.setIntegerList(integerListInput);
    }
}
