package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;
import vn.tinhh.leetcodesolve.utils.Utils;

@Component
public class Lc2801To2850 {

    //2843
    //https://leetcode.com/problems/count-symmetric-integers/description/?envType=daily-question&envId=2025-04-11
    public int countSymmetricIntegers(int low, int high) {
        int rtValue = 0;
        for (int num = low; num <= high; num++) {
            String numStr = String.valueOf(num);
            if (numStr.length() % 2 == 0) {
                int between = numStr.length() / 2;
                String first = numStr.substring(0, between);
                String last = numStr.substring(between, numStr.length());
                int sumFirst = Utils.sumOfAllNumbers(first);
                int sumLast = Utils.sumOfAllNumbers(last);
                if (sumFirst == sumLast) {
                    rtValue++;
                }
            }
        }
        return rtValue;
    }
}
