package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Lc751To800Test {

    @Autowired
    private Lc751To800 lc751To800;

    @Test
    void LC1_case1() {
        int input = 3;
        int rtValue = lc751To800.numTilings(input);
        int expected = 5;
        assertTrue(rtValue == expected);
    }
}