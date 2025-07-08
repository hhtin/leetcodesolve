package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Lc1751To1800 {

    //1751
    //https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended-ii/description/?envType=daily-question&envId=2025-07-08
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int n = events.length;

        dp = new int[k + 1][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return dfs(0, k, events);
    }

    private int[][] dp;

    private int dfs(int ci, int count, int[][] events) {
        if (count == 0 || ci == events.length) {
            return 0;
        }
        if (dp[count][ci] != -1) {
            return dp[count][ci];
        }
        int ni = func(events, events[ci][1]);
        dp[count][ci] = Math.max(dfs(ci + 1, count, events),
                events[ci][2] + dfs(ni, count - 1, events));
        return dp[count][ci];
    }

    public static int func(int[][] events, int target) {
        int left = 0, right = events.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (events[mid][0] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    //1780
    //https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/
    public boolean checkPowersOfThree(int n) {
        if (n % 3 == 1) {
            n = n - 1;
        }
        if (n % 3 == 2) {
            return false;
        }
        int sum = 0;
        int pos = 1;
        List<Integer> listPowerOfThree = new ArrayList<>();
        while (sum <= n) {
            int newInt = (int) Math.pow(3, pos);
            sum = sum + newInt;
            listPowerOfThree.add(newInt);
            pos++;
        }
        for (int i = listPowerOfThree.size() - 1; i >= 0; i--) {
            if (n >= listPowerOfThree.get(i)) {
                n = n - listPowerOfThree.get(i);
            }
            if (n == 0) {
                return true;
            }
        }
        return false;
    }

    //1790
    //https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/?envType=daily-question&envId=2025-04-28
    public boolean areAlmostEqual(String s1, String s2) {
        Character charS1 = null;
        Character charS2 = null;
        boolean isChange = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (isChange) {
                    return false;
                }
                if (charS1 == null) {
                    charS1 = s1.charAt(i);
                    charS2 = s2.charAt(i);
                } else if (charS1 != s2.charAt(i) || charS2 != s1.charAt(i)) {
                    return false;
                } else {
                    isChange = true;
                }
            }
        }
        if (charS1 == null) {
            return true;
        }
        return isChange;
    }
}
