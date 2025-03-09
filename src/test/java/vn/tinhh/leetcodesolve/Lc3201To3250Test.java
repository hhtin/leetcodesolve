package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc3201To3250Test {

    @Autowired
    private Lc3201To3250 lc3201To3250;

    @Test
    void LC3208_case1() {
        int[] nums = {0, 1, 0, 1, 0};
        int k = 3;
        int rtValue = lc3201To3250.numberOfAlternatingGroups(nums, k);
        int expected = 3;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3208_case2() {
        int[] nums = {0, 1, 0, 0, 1, 0, 1};
        int k = 6;
        int rtValue = lc3201To3250.numberOfAlternatingGroups(nums, k);
        int expected = 2;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3208_case3() {
        int[] nums = {1, 1, 0, 1};
        int k = 4;
        int rtValue = lc3201To3250.numberOfAlternatingGroups(nums, k);
        int expected = 2;
        assertTrue(rtValue == expected);
    }
}