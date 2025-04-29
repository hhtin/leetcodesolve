package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;

@Component
public class Lc2551To2600 {

    //2558
    //https://leetcode.com/problems/take-gifts-from-the-richest-pile/?envType=daily-question&envId=2025-04-29
    public long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            int max = 0;
            int pos = 0;
            for (int j = 0; j < gifts.length; j++) {
                if (gifts[j] > max) {
                    pos = j;
                    max = gifts[j];
                }
            }
            gifts[pos] = (int) Math.sqrt(gifts[pos]);
        }
        long rtValue = 0;
        for (int i = 0; i < gifts.length; i++) {
            rtValue += gifts[i];
        }
        return rtValue;
    }

    //2560
    //https://leetcode.com/problems/house-robber-iv/description/?envType=daily-question&envId=2025-03-15
    // not solve
    public int minCapability(int[] nums, int k) {
        int left = 1, right = Arrays.stream(nums).max().getAsInt(), ans = right;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canRob(nums, mid, k)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public boolean canRob(int[] nums, int mid, int k) {
        int count = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= mid) {
                count++;
                i++;
            }
        }
        return count >= k;
    }

    // 2570
    //https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int maxPos = Math.max(nums1[nums1.length - 1][0], nums2[nums2.length - 1][0]);
        int[][] alternativeResult = new int[maxPos][2];
        int num1 = 0;
        int num2 = 0;
        int pos1 = 0;
        int pos2 = 0;
        int posResult = 0;
        for (int i = 1; i <= maxPos; i++) {
            num1 = 0;
            num2 = 0;
            if (pos1 <= nums1.length - 1 && nums1[pos1][0] == i) {
                num1 = nums1[pos1][1];
                pos1++;
            }
            if (pos2 <= nums2.length - 1 && nums2[pos2][0] == i) {
                num2 = nums2[pos2][1];
                pos2++;
            }
            if (num1 != 0 || num2 != 0) {
                alternativeResult[posResult][0] = i;
                alternativeResult[posResult][1] = num1 + num2;
                posResult++;
            }
            if (pos1 > nums1.length - 1 && pos2 > nums2.length - 1) {
                break;
            }
        }
        int[][] res = new int[posResult][2];
        res = Arrays.copyOf(alternativeResult, posResult);
        return res;
    }

    //2579
    //https://leetcode.com/problems/count-total-number-of-colored-cells/description/
    public long coloredCells(int n) {
        return 1 + (long) 2 * n * (n - 1);
    }
}
