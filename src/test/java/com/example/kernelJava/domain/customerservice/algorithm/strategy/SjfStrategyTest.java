package com.example.kernelJava.domain.customerservice.algorithm.strategy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SjfStrategyTest {

    SjfStrategy sjfStrategy = new SjfStrategy();
    @Test
    void getDuration() {
        // given
        List<List<Integer>> integerList = new ArrayList<>();
        integerList.add(List.of(2, 12));
        integerList.add(List.of(5, 5));
        integerList.add(List.of(6, 6));
        integerList.add(List.of(7, 3));
        integerList.add(List.of(10, 3));
        integerList.add(List.of(9, 1));
        integerList.add(List.of(0, 1));
        // when
        int testDuration = sjfStrategy.getDuration(integerList);
        //then
        assertEquals(testDuration, 57);
    }
}