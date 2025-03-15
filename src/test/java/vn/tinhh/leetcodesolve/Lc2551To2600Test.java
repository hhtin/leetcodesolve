package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Lc2551To2600Test {

    @Autowired
    private Lc2551To2600 lc2551to2600;

    @Test
    void LC2560_case1() {
        int[] num = {2, 3, 5, 9};
        int k = 2;
        int returnValue = lc2551to2600.minCapability(num, k);
        int expected = 5;
        assertTrue(returnValue == expected);
    }

    @Test
    void LC2560_case2() {
        int[] num = {2,7,9,3,1};
        int k = 2;
        int returnValue = lc2551to2600.minCapability(num, k);
        int expected = 2;
        assertTrue(returnValue == expected);
    }

    @Test
    void LC2570_case1() {
        int[][] num1 = {{1, 2}, {2, 3}, {4, 5}};
        int[][] num2 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] rtValue = lc2551to2600.mergeArrays(num1, num2);
        int[][] expected = {{1, 6}, {2, 3}, {3, 2}, {4, 6}};
        assertTrue(Arrays.deepEquals(rtValue, expected));
    }

    @Test
    void LC2570_case2() {
        int[][] num1 = {{2, 4}, {3, 6}, {5, 5}};
        int[][] num2 = {{1, 3}, {4, 3}};
        int[][] rtValue = lc2551to2600.mergeArrays(num1, num2);
        int[][] expected = {{1, 3}, {2, 4}, {3, 6}, {4, 3}, {5, 5}};
        assertTrue(Arrays.deepEquals(rtValue, expected));
    }

    @Test
    void LC2579_case1() {
        int input = 1;
        long rtValue = lc2551to2600.coloredCells(input);
        long expected = 1L;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC2579_case2() {
        int input = 2;
        long rtValue = lc2551to2600.coloredCells(input);
        long expected = 5L;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC2579_case52() {
        int input = 69675;
        long rtValue = lc2551to2600.coloredCells(input);
        long expected = 9709071901L;
        assertTrue(rtValue == expected);
    }
}