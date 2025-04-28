package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

@Component
public class Lc2301To2350 {

    //https://leetcode.com/problems/count-subarrays-with-score-less-than-k/?envType=daily-question&envId=2025-04-28
    //2302
    public long countSubarrays(int[] nums, long k) {
        long rtValue = 0L;
        long sum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            sum = sum + nums[right];
            while (left <= right && sum * (right - left + 1) >= k) {
                sum = sum - nums[left];
                left++;
            }
            rtValue = rtValue + (right - left + 1);
        }
        return rtValue;
    }
}
