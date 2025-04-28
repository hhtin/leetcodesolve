package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;
import vn.tinhh.leetcodesolve.utils.Utils;

@Component
public class Lc3151To3200 {

    //3174
    //https://leetcode.com/problems/clear-digits/?envType=daily-question&envId=2025-04-28
    public String clearDigits(String s) {
        StringBuilder rtValue = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                rtValue.deleteCharAt(rtValue.length() - 1);
            } else {
                rtValue.append(s.charAt(i));
            }
        }
        return rtValue.toString();
    }
}
