package vn.tinhh.leetcodesolve;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.tinhh.leetcodesolve.model.ListNode;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lc1to50Test {

    @Autowired
    private Lc1to50 lc1to50;

    @Test
    void LC1_case1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] rtValue = lc1to50.twoSum(nums, target);
        int[] expected = {0, 1};
        assertTrue(Arrays.equals(rtValue, expected));
    }

    @Test
    void LC1_case2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] rtValue = lc1to50.twoSum(nums, target);
        int[] expected = {1, 2};
        assertTrue(Arrays.equals(rtValue, expected));
    }

    @Test
    void LC1_case3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] rtValue = lc1to50.twoSum(nums, target);
        int[] expected = {0, 1};
        assertArrayEquals(rtValue, expected);
    }

    @Test
    void LC2_case1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode rtValue = lc1to50.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        System.out.println(rtValue);
        System.out.println(expected);
    }

    @Test
    void LC2_case2() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode rtValue = lc1to50.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(0);
        System.out.println(rtValue);
        System.out.println(expected);
    }

    @Test
    void LC2_case3() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode rtValue = lc1to50.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        System.out.println(rtValue);
        System.out.println(expected);
    }

    @Test
    void LC9_case1() {
        int input = 121;
        boolean rtValue = lc1to50.isPalindrome(input);
        boolean expected = true;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC9_case2() {
        int input = -121;
        boolean rtValue = lc1to50.isPalindrome(input);
        boolean expected = false;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC9_case3() {
        int input = 10;
        boolean rtValue = lc1to50.isPalindrome(input);
        boolean expected = false;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC9_case26() {
        int input = 2222222;
        boolean rtValue = lc1to50.isPalindrome(input);
        boolean expected = true;
        assertTrue(rtValue == expected);
    }

    @Test
    void LC9_case11510() {
        int input = 1000030001;
        boolean rtValue = lc1to50.isPalindrome(input);
        boolean expected = false;
        assertTrue(rtValue == expected);
    }
}