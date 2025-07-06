package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc1251To1300Test {

    @Autowired
    private Lc1251To1300 lc1251To1300;

    @Test
    void LC1298_case1() {
        int[] status = {1, 0, 1, 0};
        int[] candies = {7, 5, 4, 100};
        int[][] keys = {{}, {}, {1}, {}};
        int[][] containedBoxes = {{1, 2}, {3}, {}, {}};
        int[] initialBoxes = {0};
        int rtValue = lc1251To1300.maxCandies(status, candies, keys, containedBoxes, initialBoxes);
        int expect = 16;
        assertTrue(rtValue == expect);
    }

    @Test
    void LC1298_case2() {
        int[] status = {1,0,0,0,0,0};
        int[] candies = {1,1,1,1,1,1};
        int[][] keys = {{1,2,3,4,5}, {}, {}, {},{},{}};
        int[][] containedBoxes = {{1,2,3,4,5}, {}, {}, {},{},{}};
        int[] initialBoxes = {0};
        int rtValue = lc1251To1300.maxCandies(status, candies, keys, containedBoxes, initialBoxes);
        int expect = 6;
        assertTrue(rtValue == expect);
    }
}