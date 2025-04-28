package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Lc1751To1800 {

    //1780
    //https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/
    public boolean checkPowersOfThree(int n) {
        if (n % 3 == 1) {
            n = n - 1;
        }
        if (n % 3 == 2) {
            return false;
        }
        int sum = 0;
        int pos = 1;
        List<Integer> listPowerOfThree = new ArrayList<>();
        while (sum <= n) {
            int newInt = (int) Math.pow(3, pos);
            sum = sum + newInt;
            listPowerOfThree.add(newInt);
            pos++;
        }
        for (int i = listPowerOfThree.size() - 1; i >= 0; i--) {
            if (n >= listPowerOfThree.get(i)) {
                n = n - listPowerOfThree.get(i);
            }
            if (n == 0) {
                return true;
            }
        }
        return false;
    }

    //1790
    //https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/?envType=daily-question&envId=2025-04-28
    public boolean areAlmostEqual(String s1, String s2) {
        Character charS1 = null;
        Character charS2 = null;
        boolean isChange = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (isChange) {
                    return false;
                }
                if (charS1 == null) {
                    charS1 = s1.charAt(i);
                    charS2 = s2.charAt(i);
                } else if (charS1 != s2.charAt(i) || charS2 != s1.charAt(i)) {
                    return false;
                } else {
                    isChange = true;
                }
            }
        }
        if (charS1 == null) {
            return true;
        }
        return isChange;
    }
}
