package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc1351To1400Test {

    @Autowired
    private Lc1351To1400 lc1351To1400;

    @Test
    void LC1358_case1() {
        String input = "abcabc";
        int rtValue = lc1351To1400.numberOfSubstrings(input);
        int expect = 10;
        assertTrue(rtValue == expect);
    }

    @Test
    void LC1358_case2() {
        String input = "aaacb";
        int rtValue = lc1351To1400.numberOfSubstrings(input);
        int expect = 3;
        assertTrue(rtValue == expect);
    }

    @Test
    void LC1358_case3() {
        String input = "abc";
        int rtValue = lc1351To1400.numberOfSubstrings(input);
        int expect = 1;
        assertTrue(rtValue == expect);
    }


    @Test
    void LC1399_case1() {
        int input = 13;
        int rtValue = lc1351To1400.countLargestGroup(input);
        int expect = 4;
        assertTrue(rtValue == expect);
    }

    @Test
    void LC1399_case2() {
        int input = 2;
        int rtValue = lc1351To1400.countLargestGroup(input);
        int expect = 2;
        assertTrue(rtValue == expect);
    }
}