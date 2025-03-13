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
}