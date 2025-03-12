package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Lc2451To2500 {

    // 2460
    //https://leetcode.com/problems/apply-operations-to-an-array/description/
    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        int lastPos = nums.length - 1;
        for (int i = 0; i <= lastPos; i++) {
            if (nums[i] == 0) {
                for (int j = i; j <= lastPos; j++) {
                    if (j == lastPos) {
                        nums[j] = 0;
                    } else {
                        nums[j] = nums[j + 1];
                    }
                }
                i=i-1;
                lastPos = lastPos - 1;
            }
        }
        return nums;
    }
}
