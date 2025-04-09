package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Lc3351To3400 {

    //3356
    //https://leetcode.com/problems/zero-array-transformation-ii/?envType=daily-question&envId=2025-03-13
    public int minZeroArray(int[] nums, int[][] queries) {
//        int countZero = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                countZero++;
//            }
//        }
//        if (countZero == nums.length) {
//            return 0;
//        }
//        for (int i = 0; i < queries.length; i++) {
//            for (int k = queries[i][0]; k <= queries[i][1]; k++) {
//                if (nums[k] != 0) {
//                    nums[k] = Math.max(0, nums[k] - queries[i][2]);
//                    if (nums[k] == 0) {
//                        countZero++;
//                    }
//                }
//            }
//            if (countZero == nums.length) {
//                return i + 1;
//            }
//        }
//        return -1;
        int n = nums.length;
        int[] line = new int[n + 1]; // Difference array
        int decrement = 0, k = 0; // Keep track of applied queries

        for (int i = 0; i < n; i++) { // Traverse through nums[]
            while (decrement + line[i] < nums[i]) { // If we need more decrements
                if (k == queries.length) return -1; // No more queries left

                int li = queries[k][0], ri = queries[k][1], vali = queries[k][2];
                k++; // Move to the next query

                if (ri < i) continue; // Skip if query does not affect current index

                line[Math.max(li, i)] += vali; // Start decrement at li (or current i)
                line[ri + 1] -= vali; // Stop decrement after ri
            }
            decrement += line[i]; // Accumulate applied decrements
        }
        return k;
    }

    //3375
    //https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/?envType=daily-question&envId=2025-04-09
    public int minOperations(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                return -1;
            }
            if (!list.contains(nums[i]) && nums[i] != k) {
                list.add(nums[i]);
            }
        }
        return list.size();
    }
}
