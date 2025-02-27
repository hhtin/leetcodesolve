package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc851To900Test {

    @Autowired
    private Lc851To900 lc851To900;

    @Test
    void LC873_case1() {
        int[] nums = {1,2,3,4,5,6,7,8};
        int rtValue=lc851To900.lenLongestFibSubseq(nums);
        assertTrue(rtValue == 5);
    }
    @Test
    void LC873_case2() {
        int[] nums = {1,3,7,11,12,14,18};
        int rtValue=lc851To900.lenLongestFibSubseq(nums);
        assertTrue(rtValue == 3);
    }
    @Test
    void LC873_case3() {
        int[] nums = {2,4,7,8,9,10,14,15,18,23,32,50};
        int rtValue=lc851To900.lenLongestFibSubseq(nums);
        assertTrue(rtValue == 5);
    }
    @Test
    void LC873_case4() {
        int[] nums = {2,4,5,6,7,8,11,13,14,15,21,22,34};
        int rtValue=lc851To900.lenLongestFibSubseq(nums);
        assertTrue(rtValue == 5);
    }

}