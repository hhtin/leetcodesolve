package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc1301To1350Test {

    @Autowired
    private Lc1301To1350 lc1301To1350;

    @Test
    void LC1346_case1() {
        int[] arr = {10, 2, 5, 3};
        boolean rtValue = lc1301To1350.checkIfExist(arr);
        boolean expect = true;
        assertTrue(rtValue == expect);
    }

    @Test
    void LC1346_case2() {
        int[] arr = {3, 1, 7, 11};
        boolean rtValue = lc1301To1350.checkIfExist(arr);
        boolean expect = false;
        assertTrue(rtValue == expect);
    }

}