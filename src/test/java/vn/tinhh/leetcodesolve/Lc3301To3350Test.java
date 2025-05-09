package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Lc3301To3350Test {

    @Autowired
    private Lc3301To3350 lc3301To3350;

    @Test
    void LC3306_case1() {
        String word = "aeioqq";
        int k = 1;
        long rtValue = lc3301To3350.countOfSubstrings(word, k);
        long expected = 0;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3306_case2() {
        String word = "aeiou";
        int k = 0;
        long rtValue = lc3301To3350.countOfSubstrings(word, k);
        long expected = 1;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3306_case3() {
        String word = "ieaouqqieaouqq";
        int k = 1;
        long rtValue = lc3301To3350.countOfSubstrings(word, k);
        long expected = 3;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3306_case346() {
        String word = "aeueio";
        int k = 0;
        long rtValue = lc3301To3350.countOfSubstrings(word, k);
        long expected = 1;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3306_case353() {
        String word = "aouiei";
        int k = 0;
        long rtValue = lc3301To3350.countOfSubstrings(word, k);
        long expected = 2;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3306_case360() {
        String word = "aeouih";
        int k = 0;
        long rtValue = lc3301To3350.countOfSubstrings(word, k);
        long expected = 1;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3306_case417() {
        String word = "iqeaouqi";
        int k = 2;
        long rtValue = lc3301To3350.countOfSubstrings(word, k);
        long expected = 3;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3341_case1() {
        int[][] moveTime = {{0, 4}, {4, 4}};
        int rtValue = lc3301To3350.minTimeToReach(moveTime);
        int expected = 6;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3341_case2() {
        int[][] moveTime = {{0, 0, 0}, {0, 0, 0}};
        int rtValue = lc3301To3350.minTimeToReach(moveTime);
        int expected = 3;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3341_case3() {
        int[][] moveTime = {{0, 1}, {1, 2}};
        int rtValue = lc3301To3350.minTimeToReach(moveTime);
        int expected = 3;
        assertTrue(rtValue == expected);
    }

}