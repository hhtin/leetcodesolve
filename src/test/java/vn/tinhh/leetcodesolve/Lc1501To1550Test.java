package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc1501To1550Test {

    @Autowired
    private Lc1501To1550 lc1501To1550;

    @Test
    void LC1534_case1() {
        int[] arr = {3, 0, 1, 1, 9, 7};
        int a = 7, b = 2, c = 3;
        int rtValue = lc1501To1550.countGoodTriplets(arr, a, b, c);
        int expect = 4;
        assertTrue(rtValue == expect);
    }

    @Test
    void LC1534_case2() {
        int[] arr = {1, 1, 2, 2, 3};
        int a = 0, b = 0, c = 1;
        int rtValue = lc1501To1550.countGoodTriplets(arr, a, b, c);
        int expect = 0;
        assertTrue(rtValue == expect);
    }

    @Test
    void LC1550_case1() {
        int[] arr = {2, 6, 4, 1};
        boolean rtValue = lc1501To1550.threeConsecutiveOdds(arr);
        boolean expect = false;
        assertTrue(rtValue == expect);
    }

    @Test
    void LC1550_case2() {
        int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        boolean rtValue = lc1501To1550.threeConsecutiveOdds(arr);
        boolean expect = true;
        assertTrue(rtValue == expect);
    }

    @Test
    void LC1550_case38() {
        int[] arr = {102,780,919,897,901};
        boolean rtValue = lc1501To1550.threeConsecutiveOdds(arr);
        boolean expect = true;
        assertTrue(rtValue == expect);
    }
}