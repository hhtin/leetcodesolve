package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc1451To1500Test {

    @Autowired
    private Lc1451To1500 lc1451To1500;

    @Test
    void LC1455_case1() {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        int rtValue = lc1451To1500.isPrefixOfWord(sentence, searchWord);
        int expect = 4;
        assertTrue(rtValue == expect);
    }

    @Test
    void LC1455_case2() {
        String sentence = "this problem is an easy problem";
        String searchWord = "pro";
        int rtValue = lc1451To1500.isPrefixOfWord(sentence, searchWord);
        int expect = 2;
        assertTrue(rtValue == expect);
    }

    @Test
    void LC1455_case3() {
        String sentence = "i am tired";
        String searchWord = "you";
        int rtValue = lc1451To1500.isPrefixOfWord(sentence, searchWord);
        int expect = -1;
        assertTrue(rtValue == expect);
    }
}