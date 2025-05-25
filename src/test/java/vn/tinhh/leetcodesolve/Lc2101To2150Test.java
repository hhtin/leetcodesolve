package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc2101To2150Test {

    @Autowired
    private Lc2101To2150 lc2101To2150;

    @Test
    void LC2161_case1() {
        String[] words = {"lc", "cl", "gg"};
        int rtValue = lc2101To2150.longestPalindrome(words);
        int expected = 6;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC2161_case2() {
        String[] words = {"ab", "ty", "yt", "lc", "cl", "ab"};
        int rtValue = lc2101To2150.longestPalindrome(words);
        int expected = 8;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC2161_case3() {
        String[] words = {"cc", "ll", "xx"};
        int rtValue = lc2101To2150.longestPalindrome(words);
        int expected = 2;
        assertTrue(rtValue == expected);
    }
}