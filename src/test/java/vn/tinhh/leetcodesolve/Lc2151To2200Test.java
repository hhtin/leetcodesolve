package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc2151To2200Test {

    @Autowired
    private Lc2151To2200 lc2151To2200;

    @Test
    void LC2161_case1() {
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        int[] rtValue = lc2151To2200.pivotArray(nums, pivot);
        int[] expected = {9, 5, 3, 10, 10, 12, 14};
        assertTrue(Arrays.equals(rtValue, expected));
    }

    @Test
    void LC2161_case2() {
        int[] nums = {-3, 4, 3, 2};
        int pivot = 2;
        int[] rtValue = lc2151To2200.pivotArray(nums, pivot);
        int[] expected = {-3, 2, 4, 3};
        assertTrue(Arrays.equals(rtValue, expected));
    }

}