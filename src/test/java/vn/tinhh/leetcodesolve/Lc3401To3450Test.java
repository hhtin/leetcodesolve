package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class Lc3401To3450Test {

    @Autowired
    private Lc3401To3450 lc3401To3450;

    @Test
    void LC3439_case1() {
        int eventTime = 5;
        int k = 1;
        int[] startTime = {1, 3};
        int[] endTime = {2, 5};
        int rtValue = lc3401To3450.maxFreeTime(eventTime, k, startTime, endTime);
        int expectedValue = 2;
        assertTrue(rtValue == expectedValue);
    }

    @Test
    void LC3439_case2() {
        int eventTime = 10;
        int k = 1;
        int[] startTime = {0, 2, 9};
        int[] endTime = {1, 4, 10};
        int rtValue = lc3401To3450.maxFreeTime(eventTime, k, startTime, endTime);
        int expectedValue = 6;
        assertTrue(rtValue == expectedValue);
    }

    @Test
    void LC3439_case3() {
        int eventTime = 5;
        int k = 2;
        int[] startTime = {0, 1, 2, 3, 4};
        int[] endTime = {1, 2, 3, 4, 5};
        int rtValue = lc3401To3450.maxFreeTime(eventTime, k, startTime, endTime);
        int expectedValue = 0;
        assertTrue(rtValue == expectedValue);
    }
}
