package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc2901To2950Test {

    @Autowired
    private Lc2901To2950 lc2901To2950;

    @Test
    void LC2962_case1() {
        String[] words = {"leet", "code"};
        char x = 'e';
        List<Integer> rtValue = lc2901To2950.findWordsContaining(words, x);
        List<Integer> expected = List.of(0, 1);
        assertTrue(Objects.equals(rtValue, expected));
    }

    @Test
    void LC2962_case2() {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'a';
        List<Integer> rtValue = lc2901To2950.findWordsContaining(words, x);
        List<Integer> expected = List.of(0, 2);
        assertTrue(Objects.equals(rtValue, expected));
    }

    @Test
    void LC2962_case3() {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'z';
        List<Integer> rtValue = lc2901To2950.findWordsContaining(words, x);
        List<Integer> expected = List.of();
        assertTrue(Objects.equals(rtValue, expected));

    }
}