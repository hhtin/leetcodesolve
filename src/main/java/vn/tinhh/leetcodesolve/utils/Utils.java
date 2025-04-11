package vn.tinhh.leetcodesolve.utils;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
public class Utils {

    // Return the number of substrings containing every vowel with at most k
    // consonants.
    public static long substringsWithAtMost(String word, int k) {
        if (k == -1)
            return 0;

        long res = 0;
        int vowels = 0;
        int uniqueVowels = 0;
        Map<Character, Integer> vowelLastSeen = new HashMap<>();

        for (int l = 0, r = 0; r < word.length(); ++r) {
            if (isVowel(word.charAt(r))) {
                ++vowels;
                if (!vowelLastSeen.containsKey(word.charAt(r)) || vowelLastSeen.get(word.charAt(r)) < l)
                    ++uniqueVowels;
                vowelLastSeen.put(word.charAt(r), r);
            }
            while (r - l + 1 - vowels > k) {
                if (isVowel(word.charAt(l))) {
                    --vowels;
                    if (vowelLastSeen.get(word.charAt(l)) == l)
                        --uniqueVowels;
                }
                ++l;
            }
            if (uniqueVowels == 5) {
                // Add substrings containing every vowel with at most k consonants to
                // the answer. They are
                // word[l..r], word[l + 1..r], ..., word[min(vowelLastSeen[vowel])..r]
                final int minVowelLastSeen = Arrays.asList('a', 'e', 'i', 'o', 'u')
                        .stream()
                        .mapToInt(vowel -> vowelLastSeen.get(vowel))
                        .min()
                        .getAsInt();
                res += minVowelLastSeen - l + 1;
            }
        }

        return res;
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    public static int sumOfAllNumbers(int input) {
        String s = String.valueOf(input);
        int rtValue = 0;
        for (int i = 0; i < s.length(); i++) {
            rtValue = rtValue + s.charAt(i);
        }
        return rtValue;
    }

    public static int sumOfAllNumbers(String input) {
        int rtValue = 0;
        String[] inputSplit = input.split("");
        for (int i = 0; i < inputSplit.length; i++) {
            rtValue = rtValue + Integer.parseInt(inputSplit[i]);
        }
        return rtValue;
    }
}
