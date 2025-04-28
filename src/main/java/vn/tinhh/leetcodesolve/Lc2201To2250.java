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
}
