package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc2951To3000Test {
    @Autowired
    private Lc2951To3000 lc2951To3000;

    @Test
    void LC2965_case1() {
        int[][] input = {{1, 3}, {2, 2}};
        int[] rtValue = lc2951To3000.findMissingAndRepeatedValues(input);
        int[] expected = {2, 4};
        assertTrue(Arrays.equals(rtValue, expected));
    }

    @Test
    void LC2965_case2() {
        int[][] input = {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}};
        int[] rtValue = lc2951To3000.findMissingAndRepeatedValues(input);
        int[] expected = {9, 5};
        assertTrue(Arrays.equals(rtValue, expected));
    }
}