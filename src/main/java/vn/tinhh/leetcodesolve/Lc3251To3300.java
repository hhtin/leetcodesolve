package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

@Component
public class Lc3251To3300 {

    //3264
    //https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/?envType=daily-question&envId=2025-04-29
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int pos = 0;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    pos = j;
                }
            }
            nums[pos] = min * multiplier;
        }
        return nums;
    }
}
