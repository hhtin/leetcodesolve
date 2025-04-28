package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

@Component
public class Lc1301To1350 {

    //1346
    //https://leetcode.com/problems/check-if-n-and-its-double-exist/?envType=daily-question&envId=2025-04-28
    public boolean checkIfExist(int[] arr) {
        boolean[] positive = new boolean[2001];
        boolean[] negative = new boolean[2001];
        for (int num : arr) {
            if (num >= 0) {
                if (positive[num * 2] || (num % 2 == 0 && positive[num / 2])) {
                    return true;
                } else {
                    positive[num] = true;
                }
            } else {
                num *= -1;
                if (negative[num * 2] || (num % 2 == 0 && negative[num / 2])) {
                    return true;
                } else {
                    negative[num] = true;
                }
            }
        }
        return false;
    }
}
