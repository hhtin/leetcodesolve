package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

@Component
public class Lc2351To2400 {

    //2379
    //https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/?envType=daily-question&envId=2025-03-08
    public int minimumRecolors(String blocks, int k) {
        int countW = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                countW++;
            }
        }
        int minCountW = countW;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) != blocks.charAt(i)) {
                if (blocks.charAt(i) == 'W') {
                    countW++;
                } else {
                    countW--;
                }
            }
            if (countW < minCountW) {
                minCountW = countW;
            }
        }
        return minCountW;
    }
}
