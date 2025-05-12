package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc2051To2100Test {

    @Autowired
    private Lc2051To2100 lc2051To2100;

    @Test
    void LC2094_case1() {
        int[] digits = {2, 1, 3, 0};
        int[] rtValue = lc2051To2100.findEvenNumbers(digits);
        int[] expected = {102, 120, 130, 132, 210, 230, 302, 310, 312, 320};
        assertArrayEquals(expected, rtValue);
    }

    @Test
    void LC2094_case2() {
        int[] digits = {2, 2, 8, 8, 2};
        int[] rtValue = lc2051To2100.findEvenNumbers(digits);
        int[] expected = {222, 228, 282, 288, 822, 828, 882};
        assertArrayEquals(expected, rtValue);
    }

    @Test
    void LC2094_case3() {
        int[] digits = {3,7,5};
        int[] rtValue = lc2051To2100.findEvenNumbers(digits);
        int[] expected = {};
        assertArrayEquals(expected, rtValue);
    }
}