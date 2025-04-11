package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class Lc2801To2850Test {

    @Autowired
    private Lc2801To2850 lc2801To2850;

    @Test
    void LC2843_case1() {
        int low = 1;
        int high = 100;
        int rtValue = lc2801To2850.countSymmetricIntegers(low, high);
        int expected = 9;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC2843_case2() {
        int low = 1200;
        int high = 1230;
        int rtValue = lc2801To2850.countSymmetricIntegers(low, high);
        int expected = 4;
        assertTrue(rtValue == expected);
    }
}
