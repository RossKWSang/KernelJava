package com.example.kernelJava.domain.customerservice;

import com.example.kernelJava.domain.customerservice.algorithm.FifoSchedule;
import com.example.kernelJava.domain.customerservice.algorithm.SjfSchedule;
import com.example.kernelJava.domain.customerservice.algorithm.strategy.FifoStrategy;
import com.example.kernelJava.domain.customerservice.algorithm.strategy.SjfStrategy;

import java.util.List;

public class CustomerQueue {
    private List<List<Integer>> integerListInput;
    private final FifoSchedule fifoSchedule;
    private final SjfSchedule sjfSchedule;

    public CustomerQueue() {
        this.fifoSchedule = new FifoSchedule(new FifoStrategy());
        this.sjfSchedule = new SjfSchedule(new SjfStrategy());
    }

    public void setIntegerListInput(List<List<Integer>> integerListInput) {
        this.integerListInput = integerListInput;
        fifoSchedule.setIntegerList(integerListInput);
        sjfSchedule.setIntegerList(integerListInput);
    }


    public int getFifoResult() {
        return fifoSchedule.getDuration();
    }

    public int getSjrResult() {
        return sjfSchedule.getDuration();
    }
}
