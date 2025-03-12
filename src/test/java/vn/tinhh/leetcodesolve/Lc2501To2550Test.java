package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc2501To2550Test {
    @Autowired
    private Lc2501To2550 lc2501To2550;

    @Test
    void LC2523_case1() {
        int left = 10;
        int right = 19;
        int[] rtValue = lc2501To2550.closestPrimes(left, right);
        int[] expected = {11, 13};
        assertTrue(Arrays.equals(rtValue, expected));
    }

    @Test
    void LC2523_case2() {
        int left = 4;
        int right = 6;
        int[] rtValue = lc2501To2550.closestPrimes(left, right);
        int[] expected = {-1, -1};
        assertTrue(Arrays.equals(rtValue, expected));
    }

    @Test
    void LC2529_case1() {
        int[] nums = {-2, -1, -1, 1, 2, 3};
        int rtValue = lc2501To2550.maximumCount(nums);
        int expected = 3;
        assertEquals(expected, rtValue);
    }

    @Test
    void LC2529_case2() {
        int[] nums = {-3, -2, -1, 0, 0, 1, 2};
        int rtValue = lc2501To2550.maximumCount(nums);
        int expected = 3;
        assertEquals(expected, rtValue);
    }

    @Test
    void LC2529_case3() {
        int[] nums = {5, 20, 66, 1314};
        int rtValue = lc2501To2550.maximumCount(nums);
        int expected = 4;
        assertEquals(expected, rtValue);
    }
}