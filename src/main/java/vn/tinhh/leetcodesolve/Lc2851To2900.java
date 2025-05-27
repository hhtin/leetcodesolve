package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Lc2851To2900 {

    //2894
    //https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/?envType=daily-question&envId=2025-05-27
    public int differenceOfSums(int n, int m) {
        int rtValue = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                rtValue-=i;
            } else {
                rtValue+=i;
            }
        }
        return rtValue;
    }

    //2900
    //https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i/description/?envType=daily-question&envId=2025-05-15
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        int currentGroup = -1;
        for (int i = 0; i < words.length; i++) {
            if (groups[i] != currentGroup) {
                currentGroup = groups[i];
                result.add(words[i]);
            }
        }
        return result;
    }
}
