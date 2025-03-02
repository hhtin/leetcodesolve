package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.Arrays;

@Component
public class Lc2551to2600 {

    // 2570
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


}
