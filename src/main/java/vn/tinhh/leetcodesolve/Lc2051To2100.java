package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Lc2051To2100 {
    //2094
    //https://leetcode.com/problems/finding-3-digit-even-numbers/description/
    public int[] findEvenNumbers(int[] digits) {
        int[] result = new int[451];
        int currentPos = 0;
        int[] count = new int[10];
        for (int digit : digits) {
            count[digit] = count[digit] + 1;
        }
        for (int i = 1; i < 10; i++) {
            if (count[i] == 0) continue;
            count[i]--;
            for (int j = 0; j < 10; j++) {
                if (count[j] == 0) continue;
                count[j]--;
                for (int k = 0; k < 10; k = k + 2) {
                    if (count[k] == 0) continue;
                    int num = i * 100 + j * 10 + k;
                    result[currentPos] = num;
                    currentPos++;
                }
                count[j]++;
            }
            count[i]++;
        }
        return Arrays.copyOf(result, currentPos);
    }
}
