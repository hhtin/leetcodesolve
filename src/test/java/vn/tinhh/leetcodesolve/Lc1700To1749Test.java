package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc1700To1749Test {

    @Autowired
    private Lc1700To1749 lc1700To1749;

    @Test
    void LC1749_case1() {
        int[] nums = {1,-3,2,3,-4};
        int rtValue=lc1700To1749.maxAbsoluteSum(nums);
        assertTrue(rtValue == 5);
    }

    @Test
    void LC1749_case2() {
        int[] nums = {2,-5,1,-4,3,-2};
        int rtValue=lc1700To1749.maxAbsoluteSum(nums);
        assertTrue(rtValue == 8);
    }
}