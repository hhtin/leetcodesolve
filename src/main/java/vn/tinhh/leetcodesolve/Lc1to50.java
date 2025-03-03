package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import vn.tinhh.leetcodesolve.model.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class Lc1to50 {

    //1
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
}
