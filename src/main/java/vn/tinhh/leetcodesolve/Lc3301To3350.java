package vn.tinhh.leetcodesolve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.tinhh.leetcodesolve.utils.Utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
public class Lc3301To3350 {

    @Autowired
    private Utils utils;

    //3306
    //https://leetcode.com/problems/count-of-substrings-containing-every-vowel-and-k-consonants-ii/?envType=daily-question&envId=2025-03-10
    // Same as 3305. Count of Substrings Containing Every Vowel and K Consonants I
    public long countOfSubstrings(String word, int k) {
        return utils.substringsWithAtMost(word, k) - utils.substringsWithAtMost(word, k - 1);
    }


}
