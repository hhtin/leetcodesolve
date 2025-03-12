package vn.tinhh.leetcodesolve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.tinhh.leetcodesolve.utils.AlgorithmUtils;

@Component
public class Lc2501To2550 {
    @Autowired
    private AlgorithmUtils algorithmUtils;

    //2523
    public int[] closestPrimes(int left, int right) {
        int[] ans = new int[]{-1, -1};
        int pos1 = 0;
        int pos2 = 0;
        int currentSpace = 0;
        int smartestPrimeSpace = 0;
        for (int i = left; i <= right; i++) {
            if (algorithmUtils.isPrime(i)) {
                if (pos1 == 0) {
                    pos1 = i;
                } else {
                    pos2 = i;
                    currentSpace = pos2 - pos1;
                    if (smartestPrimeSpace == 0) {
                        smartestPrimeSpace = currentSpace;
                        ans = new int[]{pos1, pos2};
                    }
                    if (currentSpace < smartestPrimeSpace) {
                        smartestPrimeSpace = currentSpace;
                        ans = new int[]{pos1, pos2};
                    }
                    pos1 = i;
                }
            }
        }
        return ans;
    }

    //2529
    //https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/?envType=daily-question&envId=2025-03-12
    public int maximumCount(int[] nums) {
        if (nums[0] > 0 || nums[nums.length - 1] < 0) {
            return nums.length;
        }
        int negativeSum = 0;
        int positiveSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && i + 1 < nums.length && (nums[i + 1] == 0 || nums[i + 1] > 0)) {
                negativeSum = i + 1;
            }
            if (nums[i] > 0) {
                if (negativeSum == 0) {
                    negativeSum = i;
                }
                positiveSum = nums.length - i;
                break;
            }
        }
        return Math.max(negativeSum, positiveSum);
    }
}
