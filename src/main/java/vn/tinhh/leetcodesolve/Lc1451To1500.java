package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

@Component
public class Lc1451To1500 {

    //1455
    //https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/?envType=daily-question&envId=2025-04-29
    public int isPrefixOfWord(String sentence, String searchWord) {
        if (!sentence.contains(searchWord)) {
            return -1;
        }
        String[] springSplit = sentence.split(" ");
        for (int i = 0; i < springSplit.length; i++) {
            if (springSplit[i].startsWith(searchWord)) {
                return i+1;
            }
        }
        return -1;
    }
}
