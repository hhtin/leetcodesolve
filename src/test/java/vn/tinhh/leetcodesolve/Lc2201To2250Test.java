package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc2201To2250Test {

    @Autowired
    private Lc2201To2250 lc2201To2250;

    @Test
    void LC2206_case1() {
        int[] nums = {3, 2, 3, 2, 2, 2};
        boolean rtValue = lc2201To2250.divideArray(nums);
        boolean expected = true;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC2206_case2() {
        int[] nums = {1, 2, 3, 4};
        boolean rtValue = lc2201To2250.divideArray(nums);
        boolean expected = false;
        assertTrue(rtValue == expected);
    }
}