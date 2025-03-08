package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc2351To2400Test {

    @Autowired
    private Lc2351To2400 lc2351To2400;

    @Test
    void LC2379_case1() {
        String input = "WBBWWBBWBW";
        int block = 7;
        int rtValue = lc2351To2400.minimumRecolors(input, block);
        int expected = 3;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC2379_case2() {
        String input = "WBWBBBW";
        int block = 2;
        int rtValue = lc2351To2400.minimumRecolors(input, block);
        int expected = 0;
        assertTrue(rtValue == expected);
    }
}