package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import vn.tinhh.leetcodesolve.model.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Component
public class Lc1to50 {

    //1
    //https://leetcode.com/problems/two-sum/description/
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int minusValue = 0;
        for (int i = 0; i < nums.length; i++) {
            minusValue = target - nums[i];
            if (map.containsKey(minusValue)) {
                if (map.get(minusValue) != i) {
                    return new int[]{map.get(minusValue), i};
                }

            }
            map.put(nums[i], i);
        }
        return null;
    }

    //2
    //https://leetcode.com/problems/add-two-numbers/description/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode returnValue = new ListNode();
        boolean flag = false;
        int resultSum = 0;
        if (l1 != null) {
            resultSum = resultSum + l1.val;
        }
        if (l2 != null) {
            resultSum = resultSum + l2.val;
        }
        if (resultSum >= 10) {
            resultSum = resultSum - 10;
            flag = true;

        }
        returnValue.val = (resultSum);
        if (l1.next != null && l2.next != null) {
            if (flag) {
                l1.next = new ListNode(l1.next.val + 1, l1.next.next);
            }
            returnValue.next = addTwoNumbers(l1.next, l2.next);
        } else if (l1.next != null && l2.next == null) {
            if (flag) {
                l1.next = new ListNode(l1.next.val + 1, l1.next.next);
            }
            returnValue.next = addTwoNumbers(l1.next, new ListNode(0));
        } else if (l1.next == null && l2.next != null) {
            if (flag) {
                l2.next = new ListNode(l2.next.val + 1, l2.next.next);
            }
            returnValue.next = addTwoNumbers(new ListNode(0), l2.next);
        } else if (l1.next == null && l2.next == null && flag) {
            returnValue.next = new ListNode(1);
        }
        return returnValue;
    }

    //6
    //https://leetcode.com/problems/zigzag-conversion/description/
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        Map<Integer, String> newMap = new HashMap<>();
        int pos = 1;
        boolean isUpper = false;
        while (!s.isEmpty()) {
            String currentChar = s.substring(0, 1);
            s = s.substring(1);

            String pastChar = newMap.get(pos);
            String newChar = "";
            if (Objects.isNull(pastChar)) {
                newChar = currentChar;
            } else {
                newChar = pastChar + currentChar;
            }
            newMap.put(pos, newChar);
            if (pos == numRows || pos == 1) {
                isUpper = !isUpper;
            }
            if (isUpper) {
                pos++;
            } else {
                pos--;
            }

        }
        StringBuilder rtValue = new StringBuilder();
        for (Integer key : newMap.keySet()) {
            rtValue.append(newMap.get(key));
        }
        return rtValue.toString();
    }

    //9
    //https://leetcode.com/problems/palindrome-number/description/
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        String str = String.valueOf(x);
        int length = str.length() / 2;
        String first = "";
        String last = "";
        for (int i = 0; i < length; i++) {
            first = str.substring(0, 1);
            last = str.substring(str.length() - 1, str.length());
            if (1 < str.length() - 1) {
                str = str.substring(1, str.length() - 1);
            }
            if (!first.equals(last)) {
                return false;
            }
        }
        return true;
    }
}
