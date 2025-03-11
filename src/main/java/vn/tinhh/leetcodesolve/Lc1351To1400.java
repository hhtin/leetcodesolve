package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Lc1351To1400 {

    //1358
    //https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/?envType=daily-question&envId=2025-03-11
    public int numberOfSubstrings(String s) {
        int count = 0;
        int left = 0;
        int[] charCount = new int[3];

        for (int right = 0; right < s.length(); right++) {
            charCount[s.charAt(right) - 'a']++;

            while (charCount[0] > 0 && charCount[1] > 0 && charCount[2] > 0) {
                count += s.length() - right;
                charCount[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }
}
