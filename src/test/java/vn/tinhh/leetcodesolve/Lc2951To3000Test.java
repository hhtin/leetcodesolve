package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc2951To3000Test {
    @Autowired
    private Lc2951To3000 lc2951To3000;

    @Test
    void LC2965_case1() {
        int[][] input = {{1, 3}, {2, 2}};
        int[] rtValue = lc2951To3000.findMissingAndRepeatedValues(input);
        int[] expected = {2, 4};
        assertTrue(Arrays.equals(rtValue, expected));
    }

    @Test
    void LC2965_case2() {
        int[][] input = {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}};
        int[] rtValue = lc2951To3000.findMissingAndRepeatedValues(input);
        int[] expected = {9, 5};
        assertTrue(Arrays.equals(rtValue, expected));
    }

    @Test
    void LC2999_case1() {
        long start = 1L;
        long finish = 6000L;
        int limit = 4;
        String s = "124";
        long rtValue = lc2951To3000.numberOfPowerfulInt(start, finish, limit, s);
        long expected = 5L;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC2999_case2() {
        long start = 15L;
        long finish = 215L;
        int limit = 6;
        String s = "10";
        long rtValue = lc2951To3000.numberOfPowerfulInt(start, finish, limit, s);
        long expected = 2L;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC2999_case3() {
        long start = 1000L;
        long finish = 2000L;
        int limit = 4;
        String s = "3000";
        long rtValue = lc2951To3000.numberOfPowerfulInt(start, finish, limit, s);
        long expected = 0L;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC2999_case97() {
        long start = 20L;
        long finish = 1159L;
        int limit = 5;
        String s = "20";
        long rtValue = lc2951To3000.numberOfPowerfulInt(start, finish, limit, s);
        long expected = 8L;
        assertTrue(rtValue == expected);
    }
}