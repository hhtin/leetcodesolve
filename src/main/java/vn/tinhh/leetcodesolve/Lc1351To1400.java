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

    //1394
    //https://leetcode.com/problems/find-lucky-integer-in-an-array/description/?envType=daily-question&envId=2025-07-05
    public int findLucky(int[] arr) {
        int[] count = new int[501];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = count.length - 1; i > 0; i--) {
            if (count[i] == i) {
                return i;
            }
        }
        return -1;
    }

    //1399
    //https://leetcode.com/problems/count-largest-group/?envType=daily-question&envId=2025-04-28
    public int countLargestGroup(int n) {
        int[] count = new int[37];
        int maxCount = 0;
        int rtValue = 0;
        for (int num = 1; num <= n; num++) {
            int sum = 0;
            int numCount = num;
            while (numCount > 0) {
                sum += numCount % 10;
                numCount /= 10;
            }
            int currentCount = count[sum] + 1;
            if (currentCount > maxCount) {
                maxCount = currentCount;
                rtValue = 1;
            } else if (currentCount == maxCount) {
                rtValue++;
            }
            count[sum] = currentCount;
        }
        return rtValue;
    }
}
