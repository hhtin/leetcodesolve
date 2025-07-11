package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc2401To2450Test {

    @Autowired
    private Lc2401To2450 lc2401To2450;

    @Test
    void LC2402_case1() {
        int n = 2;
        int[][] meetings = {{0, 10}, {1, 5}, {2, 7}, {3, 4}};
        int rtValue = lc2401To2450.mostBooked(n, meetings);
        int expectedValue = 0;
        assertEquals(expectedValue, rtValue);
    }

    @Test
    void LC2402_case2() {
        int n = 3;
        int[][] meetings = {{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}};
        int rtValue = lc2401To2450.mostBooked(n, meetings);
        int expectedValue = 1;
        assertEquals(expectedValue, rtValue);
    }

    @Test
    void LC2402_case62() {
        int n = 3;
        int[][] meetings = {{0, 10}, {1, 9}, {2, 8}, {3, 7}, {4, 6}};
        int rtValue = lc2401To2450.mostBooked(n, meetings);
        int expectedValue = 1;
        assertEquals(expectedValue, rtValue);
    }

    @Test
    void LC2402_case69() {
        int n = 2;
        int[][] meetings = {{43, 44}, {34, 36}, {11, 47}, {1, 8}, {30, 33}, {45, 48}, {23, 41}, {29, 30}};
        int rtValue = lc2401To2450.mostBooked(n, meetings);
        int expectedValue = 1;
        assertEquals(expectedValue, rtValue);
    }
}