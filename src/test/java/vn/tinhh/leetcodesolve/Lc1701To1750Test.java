package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc1701To1750Test {

    @Autowired
    private Lc1701To1750 lc1701To1750;

    @Test
    void LC1749_case1() {
        int[] nums = {1,-3,2,3,-4};
        int rtValue= lc1701To1750.maxAbsoluteSum(nums);
        assertTrue(rtValue == 5);
    }

    @Test
    void LC1749_case2() {
        int[] nums = {2,-5,1,-4,3,-2};
        int rtValue= lc1701To1750.maxAbsoluteSum(nums);
        assertTrue(rtValue == 8);
    }
}