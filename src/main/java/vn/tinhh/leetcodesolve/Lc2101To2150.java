package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Lc2101To2150 {

    //2131
    //https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/?envType=daily-question&envId=2025-05-25
    public int longestPalindrome(String[] words) {
        int[][] count = new int[26][26];
        int rtValue = 0;
        int first = -1;
        int last = -1;
        for (String word : words) {
            first = word.charAt(0) - 'a';
            last = word.charAt(1) - 'a';
            if (count[last][first] > 0) {
                count[last][first] = count[last][first] - 1;
                rtValue += 4;
            } else {
                count[first][last] = count[first][last] + 1;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i][i] > 0) {
                rtValue += 2;
                break;
            }
        }
        return rtValue;
    }

    //2138
    //https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/description/?envType=daily-question&envId=2025-06-22
    public String[] divideString(String s, int k, char fill) {
        int numOfSpaces = s.length() / k;
        if (s.length() % k != 0) {
            numOfSpaces += 1;
        }
        String[] result = new String[numOfSpaces];
        for (int i = 0; i < numOfSpaces; i++) {
            result[i] = s.substring(i * k, Math.min((i + 1) * k, s.length()));
        }
        if (result[numOfSpaces - 1].length() != k) {
            int numOfSpacesMissing = k - result[numOfSpaces - 1].length();
            for (int i = 0; i < numOfSpacesMissing; i++) {
                result[numOfSpaces - 1] = result[numOfSpaces - 1] + fill;
            }
        }
        return result;
    }
}
