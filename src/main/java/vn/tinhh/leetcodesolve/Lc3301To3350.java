package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
public class Lc3301To3350 {

    //3306
    //https://leetcode.com/problems/count-of-substrings-containing-every-vowel-and-k-consonants-ii/?envType=daily-question&envId=2025-03-10
    // Same as 3305. Count of Substrings Containing Every Vowel and K Consonants I
    public long countOfSubstrings(String word, int k) {
        return substringsWithAtMost(word, k) - substringsWithAtMost(word, k - 1);
    }

    // Return the number of substrings containing every vowel with at most k
    // consonants.
    private long substringsWithAtMost(String word, int k) {
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

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
