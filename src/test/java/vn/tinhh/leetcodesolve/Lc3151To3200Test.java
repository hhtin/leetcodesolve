package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc3151To3200Test {

    @Autowired
    private Lc3151To3200 lc3151To3200;

    @Test
    void LC3174_case1() {
        String input = "abc";
        String rtValue = lc3151To3200.clearDigits(input);
        String expected = "abc";
        assertEquals(expected, rtValue);
    }

    @Test
    void LC3174_case2() {
        String input = "cb34";
        String rtValue = lc3151To3200.clearDigits(input);
        String expected = "";
        assertEquals(expected, rtValue);
    }
}