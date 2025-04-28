package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc3351To3400Test {

    @Autowired
    private Lc3351To3400 lc3351To3400;

    @Test
    void LC3356_case1() {
        int[] nums = {2, 0, 2};
        int[][] queries = {{0, 2, 1}, {0, 2, 1}, {1, 1, 3}};
        int rtValue = lc3351To3400.minZeroArray(nums, queries);
        int expected = 2;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3356_case2() {
        int[] nums = {4, 3, 2, 1};
        int[][] queries = {{1, 3, 2}, {0, 2, 1}};
        int rtValue = lc3351To3400.minZeroArray(nums, queries);
        int expected = -1;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3375_case1() {
        int[] nums = {5, 2, 5, 4, 5};
        int k = 2;
        int rtValue = lc3351To3400.minOperations(nums, k);
        int expected = 2;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3375_case2() {
        int[] nums = {2, 1, 2};
        int k = 2;
        int rtValue = lc3351To3400.minOperations(nums, k);
        int expected = -1;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3375_case3() {
        int[] nums = {9, 7, 5, 3};
        int k = 1;
        int rtValue = lc3351To3400.minOperations(nums, k);
        int expected = 4;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3375_case727() {
        int[] nums = {3, 10, 6, 6, 9, 9, 1};
        int k = 1;
        int rtValue = lc3351To3400.minOperations(nums, k);
        int expected = 4;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3392_case1() {
        int[] nums = {1, 2, 1, 4, 1};
        int rtValue = lc3351To3400.countSubarrays(nums);
        int expected = 1;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3392_case2() {
        int[] nums = {1, 1, 1};
        int rtValue = lc3351To3400.countSubarrays(nums);
        int expected = 0;
        assertTrue(rtValue == expected);
    }
}