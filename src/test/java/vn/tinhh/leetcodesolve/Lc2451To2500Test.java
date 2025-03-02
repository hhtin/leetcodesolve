package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class Lc2451To2500Test {

    @Autowired
    private Lc2451To2500 lc2451To2500;

    @Test
    void LC2460_case1() {
        int[] nums = {1,2,2,1,1,0};
        int[] rtValue= lc2451To2500.applyOperations(nums);

        int[] expected = {1,4,2,0,0,0};
        assertTrue(Arrays.equals(rtValue,expected));
    }

    @Test
    void LC2460_case2() {
        int[] nums = {0,1};
        int[] rtValue= lc2451To2500.applyOperations(nums);

        int[] expected = {1,0};
        assertTrue(Arrays.equals(rtValue,expected));
    }


    @Test
    void LC2460_case3() {
        int[] nums = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        int[] rtValue= lc2451To2500.applyOperations(nums);

        int[] expected = {1694,399,832,1758,412,206,272,0,0,0,0,0,0,0};
        assertTrue(Arrays.equals(rtValue,expected));
    }
}

