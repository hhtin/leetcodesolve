package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc3101To3150Test {

    @Autowired
    private Lc3101To3150 lc3101To3150;

    @Test
    void LC3136_case1() {
        String word = "234Adas";
        boolean rtValue = lc3101To3150.isValid(word);
        boolean expected = true;
        assertEquals(expected, rtValue);
    }

    @Test
    void LC3136_case2() {
        String word = "b3";
        boolean rtValue = lc3101To3150.isValid(word);
        boolean expected = false;
        assertEquals(expected, rtValue);
    }

    @Test
    void LC3136_case3() {
        String word = "a3$e";
        boolean rtValue = lc3101To3150.isValid(word);
        boolean expected = false;
        assertEquals(expected, rtValue);
    }
}