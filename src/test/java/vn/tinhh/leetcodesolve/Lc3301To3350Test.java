package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Lc3301To3350Test {

    @Autowired
    private Lc3301To3350 lc3301To3350;

    @Test
    void LC3304_case1() {
        int k = 5;
        char rtValue = lc3301To3350.kthCharacter(k);
        char expected = 'b';
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3304_case2() {
        int k = 10;
        char rtValue = lc3301To3350.kthCharacter(k);
        char expected = 'c';
        assertTrue(rtValue == expected);
    }

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
    void LC3307_case1() {
        long k = 5;
        int[] operations = {0, 0, 0};
        char rtValue = lc3301To3350.kthCharacter(k, operations);
        char expected = 'a';
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3307_case2() {
        long k = 10;
        int[] operations = {0, 1, 0, 1};
        char rtValue = lc3301To3350.kthCharacter(k, operations);
        char expected = 'b';
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3330_case1() {
        String word = "abbcccc";
        int rtValue = lc3301To3350.possibleStringCount(word);
        int expected = 5;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3330_case2() {
        String word = "abcd";
        int rtValue = lc3301To3350.possibleStringCount(word);
        int expected = 1;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3330_case3() {
        String word = "aaaa";
        int rtValue = lc3301To3350.possibleStringCount(word);
        int expected = 4;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3333_case1() {
        String word = "aabbccdd";
        int k = 7;
        int rtValue = lc3301To3350.possibleStringCount(word, k);
        int expected = 5;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3333_case2() {
        String word = "aabbccdd";
        int k = 8;
        int rtValue = lc3301To3350.possibleStringCount(word, k);
        int expected = 1;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3333_case3() {
        String word = "aaabbb";
        int k = 3;
        int rtValue = lc3301To3350.possibleStringCount(word, k);
        int expected = 8;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3337_case1() {
        String s = "abcyy";
        int t = 2;
        List<Integer> nums = List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2);
        int rtValue = lc3301To3350.lengthAfterTransformations(s, t, nums);
        int expected = 7;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC3337_case2() {
        String s = "azbk";
        int t = 1;
        List<Integer> nums = List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
        int rtValue = lc3301To3350.lengthAfterTransformations(s, t, nums);
        int expected = 8;
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