package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc1751To1800Test {

    @Autowired
    private Lc1751To1800 lc1751To1800;

    @Test
    void LC1780_case1() {
        int input = 10;
        boolean rtValue = lc1751To1800.checkPowersOfThree(input);
        boolean expect = true;
        assertTrue(rtValue == expect);
    }

    @Test
    void LC1780_case2() {
        int input = 91;
        boolean rtValue = lc1751To1800.checkPowersOfThree(input);
        boolean expect = true;
        assertTrue(rtValue == expect);
    }

    @Test
    void LC1780_case3() {
        int input = 21;
        boolean rtValue = lc1751To1800.checkPowersOfThree(input);
        boolean expect = false;
        assertTrue(rtValue == expect);
    }
}