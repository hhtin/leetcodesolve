package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

@Component
public class Lc1501To1550 {

    //1534
    //https://leetcode.com/problems/count-good-triplets/?envType=daily-question&envId=2025-04-14
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        if (arr.length < 3) return 0;
        int rtValue = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a &&
                            Math.abs(arr[j] - arr[k]) <= b &&
                            Math.abs(arr[i] - arr[k]) <= c) {
                        rtValue = rtValue + 1;
                    }
                }
            }
        }
        return rtValue;
    }
}
