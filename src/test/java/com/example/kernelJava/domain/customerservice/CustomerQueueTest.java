package com.example.kernelJava.domain.customerservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerQueueTest {

    private List<List<Integer>> testIntegerList;
    private CustomerQueue customerQueue;

    @BeforeEach
    void setCustomerQueue() {
        testIntegerList = new ArrayList<>();
        testIntegerList.add(List.of(2, 12));
        testIntegerList.add(List.of(5, 5));
        testIntegerList.add(List.of(6, 6));
        testIntegerList.add(List.of(7, 3));
        testIntegerList.add(List.of(10, 3));
        testIntegerList.add(List.of(9, 1));
        testIntegerList.add(List.of(0, 1));

        customerQueue = new CustomerQueue();
        customerQueue.setIntegerListInput(testIntegerList);
    }
    @Test
    void getFifoResult() {
        // when
        int result = customerQueue.getFifoResult();
        // then
        assertEquals(result, 78);
    }

    @Test
    void getSjrResult() {
        // when
        int result = customerQueue.getSjrResult();
        // then
        assertEquals(result, 57);
    }
}