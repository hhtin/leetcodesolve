package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc51To100Test {

    @Autowired
    private Lc51To100 lc51To100;

    @Test
    void LC75_case1() {
        int[] nums = {2,0,2,1,1,0};
        lc51To100.sortColors(nums);
//        int[] expected = {0,0,1,1,2,2};
//        assertTrue(Arrays.equals(rtValue, expected));
    }

    @Test
    void LC75_case2() {
        int[] nums = {2,0,1};
        lc51To100.sortColors(nums);
//        int[] expected = {0,1,2};
//        assertTrue(Arrays.equals(rtValue, expected));
    }
}