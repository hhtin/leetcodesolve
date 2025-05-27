package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc2851To2900Test {

    @Autowired
    private Lc2851To2900 lc2851To2900;

    @Test
    void LC2894_case1() {
        int n = 10;
        int m = 3;
        int rtValue = lc2851To2900.differenceOfSums(n, m);
        int expected = 19;
        assertEquals(rtValue, expected);
    }

    @Test
    void LC2894_case2() {
        int n = 5;
        int m = 6;
        int rtValue = lc2851To2900.differenceOfSums(n, m);
        int expected = 15;
        assertEquals(rtValue, expected);
    }

    @Test
    void LC2894_case3() {
        int n = 5;
        int m = 1;
        int rtValue = lc2851To2900.differenceOfSums(n, m);
        int expected = -15;
        assertEquals(rtValue, expected);
    }

    @Test
    void LC2900_case1() {
        String[] words = {"e", "a", "b"};
        int[] groups = {0, 0, 1};
        List<String> rtValue = lc2851To2900.getLongestSubsequence(words, groups);
        List<String> expected = List.of("e", "b");
        assertEquals(rtValue, expected);
    }

    @Test
    void LC2900_case2() {
        String[] words = {"a", "b", "c", "d"};
        int[] groups = {1, 0, 1, 1};
        List<String> rtValue = lc2851To2900.getLongestSubsequence(words, groups);
        List<String> expected = List.of("a", "b", "c");
        assertEquals(rtValue, expected);
    }
}