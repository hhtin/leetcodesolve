package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Lc2851To2900 {

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
