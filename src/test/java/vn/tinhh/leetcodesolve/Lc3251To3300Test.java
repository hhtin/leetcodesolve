package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc3251To3300Test {

    @Autowired
    private Lc3251To3300 lc3251To3300;

    @Test
    void LC3264_case1() {
        int[] nums = {2, 1, 3, 5, 6};
        int k = 5;
        int multiplier = 2;
        int[] rtValue = lc3251To3300.getFinalState(nums, k, multiplier);
        int[] expected = {8, 4, 6, 5, 6};
        assertTrue(Arrays.equals(rtValue, expected));
    }

    @Test
    void LC3264_case2() {
        int[] nums = {1, 2};
        int k = 3;
        int multiplier = 4;
        int[] rtValue = lc3251To3300.getFinalState(nums, k, multiplier);
        int[] expected = {16, 8};
        assertTrue(Arrays.equals(rtValue, expected));
    }

    @Test
    void LC3264_case726() {
        int[] nums = {1};
        int k = 4;
        int multiplier = 5;
        int[] rtValue = lc3251To3300.getFinalState(nums, k, multiplier);
        int[] expected = {625};
        assertTrue(Arrays.equals(rtValue, expected));
    }
}