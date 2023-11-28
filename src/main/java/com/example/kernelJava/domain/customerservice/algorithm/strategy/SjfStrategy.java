package com.example.kernelJava.domain.customerservice.algorithm.strategy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

@Slf4j
public class SjfStrategy implements ScheduleStrategy{

    @Override
    public int getDuration(List<List<Integer>> integerList) {
        int waitingTime;
        int currentTime = 0;
        int totalWaitingTime = 0;

        integerList.sort(Comparator.comparingInt(list -> list.get(0)));
        integerList.sort(Comparator.comparingInt(list -> list.get(1)));
        for (List<Integer> list : integerList) {
            int arrival = list.get(0);
            int jobDuration = list.get(1);
            if (currentTime <= arrival) {
                currentTime = arrival + jobDuration;
                waitingTime = 0;
                log.info(String.format("도착시간: %d분, 소요시간: %d분, 현재시간: %d분, 기다린 시간: %d", list.get(0), list.get(1), currentTime, waitingTime));
                continue;
            }
            waitingTime = currentTime - arrival;
            totalWaitingTime += waitingTime;
            currentTime += jobDuration;
            log.info(String.format("도착시간: %d분, 소요시간: %d분, 현재시간: %d분, 기다린 시간: %d", list.get(0), list.get(1), currentTime, waitingTime));
        }
        return totalWaitingTime;
    }
}
