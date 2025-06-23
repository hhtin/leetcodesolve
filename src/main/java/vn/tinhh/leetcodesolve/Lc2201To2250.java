package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

@Component
public class Lc2201To2250 {

    //2206
    //https://leetcode.com/problems/divide-array-into-equal-pairs/?envType=daily-question&envId=2025-04-28
    public boolean divideArray(int[] nums) {
        boolean[] count = new boolean[501];
        int countNotFount = 0;
        for (int i = 0; i < nums.length; i++) {
            int checkNums = nums[i];
            if (!count[checkNums]) {
                count[checkNums] = true;
                countNotFount++;
            } else {
                count[checkNums] = false;
                countNotFount--;
            }
        }
        return countNotFount == 0;
    }

    //2226
    //https://leetcode.com/problems/maximum-candies-allocated-to-k-children/?envType=daily-question&envId=2025-03-14
    public int maximumCandies(int[] candies, long k) {
        int left = 1, right = 10_000_000;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long childrenCount = 0;

            for (int candy : candies) {
                childrenCount += candy / mid;
            }

            if (childrenCount >= k) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
