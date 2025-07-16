package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

@Component
public class Lc3101To3150 {

    //3136
    //https://leetcode.com/problems/valid-word/?envType=daily-question&envId=2025-07-15
    public boolean isValid(String word) {
        if (word == null || word.length() < 3) {
            return false;
        }
        boolean hasVowel = false;
        boolean hasConsonant = false;
        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false; // chỉ cho phép chữ cái và chữ số
            }
            if (Character.isLetter(c)) {
                char lower = Character.toLowerCase(c);
                if ("aeiou".indexOf(lower) >= 0) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }
        return hasVowel && hasConsonant;
    }
}
