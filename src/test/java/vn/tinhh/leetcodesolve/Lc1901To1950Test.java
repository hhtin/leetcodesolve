package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc1901To1950Test {

    @Autowired
    private Lc1901To1950 lc1901To1950;

    @Test
    void LC1920_case1() {
        int[] input = {0, 2, 1, 5, 3, 4};
        int[] rtValue = lc1901To1950.buildArray(input);
        int[] expected = {0, 1, 2, 4, 5, 3};
        assertArrayEquals(expected, rtValue);
    }

    @Test
    void LC1920_case2() {
        int[] input = {5, 0, 1, 2, 3, 4};
        int[] rtValue = lc1901To1950.buildArray(input);
        int[] expected = {4, 5, 0, 1, 2, 3};
        assertArrayEquals(expected, rtValue);
    }
}