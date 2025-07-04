package vn.tinhh.leetcodesolve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.tinhh.leetcodesolve.utils.Utils;

import java.util.*;

@Component
public class Lc3301To3350 {

    @Autowired
    private Utils utils;

    //3304
    //https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/?envType=daily-question&envId=2025-07-03
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while (word.length() < k) {
            StringBuilder newWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char newChar = (char) (word.charAt(i) + 1);
                newWord.append(newChar);
            }
            word.append(newWord);
        }
        return word.toString().charAt(k - 1);
    }

    //3306
    //https://leetcode.com/problems/count-of-substrings-containing-every-vowel-and-k-consonants-ii/?envType=daily-question&envId=2025-03-10
    // Same as 3305. Count of Substrings Containing Every Vowel and K Consonants I
    public long countOfSubstrings(String word, int k) {
        return utils.substringsWithAtMost(word, k) - utils.substringsWithAtMost(word, k - 1);
    }

    //3307
    //https://leetcode.com/problems/find-the-k-th-character-in-string-game-ii/?envType=daily-question&envId=2025-07-04
    public char kthCharacter(long k, int[] operations) {
        int n = operations.length;
        long[] lengths = new long[n + 1];
        lengths[0] = 1;
        for (int i = 1; i <= n; i++) {
            lengths[i] = lengths[i - 1] * 2;
            if (lengths[i] >= k) {
                lengths[i] = k;
            }
        }
        char curr = 'a';
        for (int i = n; i > 0; i--) {
            long half = lengths[i - 1];
            if (k > half) {
                k -= half;
                if (operations[i - 1] == 1) {
                    curr = (char) ((curr - 'a' + 1) % 26 + 'a');
                }
            }
        }
        return curr;
    }

    //3330
    //https://leetcode.com/problems/find-the-original-typed-string-i/?envType=daily-question&envId=2025-07-01
    public int possibleStringCount(String word) {
        int rtValue = 1;
        char current = word.charAt(0);
        for (int pos = 1; pos < word.length(); pos++) {
            if (current == word.charAt(pos)) {
                rtValue++;
            } else {
                current = word.charAt(pos);
            }
        }
        return rtValue;
    }

    //3333
    //https://leetcode.com/problems/find-the-original-typed-string-ii/?envType=daily-question&envId=2025-07-02
    private static final int MOD = (int) 1e9 + 7;

    public int possibleStringCount(String word, int k) {
        if (word.isEmpty()) return 0;

        List<Integer> groups = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) count++;
            else {
                groups.add(count);
                count = 1;
            }
        }
        groups.add(count);

        long total = 1;
        for (int num : groups) total = (total * num) % MOD;

        if (k <= groups.size()) return (int) total;

        int[] dp = new int[k];
        dp[0] = 1;
        for (int num : groups) {
            int[] newDp = new int[k];
            long sum = 0;
            for (int s = 0; s < k; s++) {
                if (s > 0) sum = (sum + dp[s - 1]) % MOD;
                if (s > num) sum = (sum - dp[s - num - 1] + MOD) % MOD;
                newDp[s] = (int) sum;
            }
            dp = newDp;
        }
        long invalid = 0;
        for (int s = groups.size(); s < k; s++) invalid = (invalid + dp[s]) % MOD;

        return (int) ((total - invalid + MOD) % MOD);
    }

    //3337
    //https://leetcode.com/problems/total-characters-in-string-after-transformations-ii/description/?envType=daily-question&envId=2025-05-14
    public int lengthAfterTransformations(String s, int t, List<Integer> nums) {
        for (int i = 0; i < t; i++) {
            String newString = "";
            for (int j = 0; j < s.length(); j++) {
                Character current = s.charAt(j);
                int pos = current - 97;
                int max = nums.get(pos);
                for (int k = 1; k <= max; k++) {
                    Character character = (char) (s.charAt(j) + k);
                    if (character > 122) {
                        character = (char) (character - 26);
                    }
                    newString = newString + String.valueOf(character);
                }
            }
            if (i == t - 1 && newString.length() > 100000007) {
                return 100000007;
            }
            if (i == t - 1) {
                return newString.length();
            }
            s = newString;
        }
        return 0;
    }

    //3341
    //https://leetcode.com/problems/find-minimum-time-to-reach-last-room-i/?envType=daily-question&envId=2025-05-07
    public int minTimeToReach(int[][] moveTime) {
        int r = moveTime.length, c = moveTime[0].length;
        int[][] minimumTime = new int[r][c];
        for (int[] is : minimumTime) {
            Arrays.fill(is, Integer.MAX_VALUE);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.steps - b.steps);
        pq.add(new Pair(-1, 0, 0));
        minimumTime[0][0] = 0;

        while (!pq.isEmpty()) {
            Pair top = pq.poll();
            int i = top.i, j = top.j, nextStep = top.steps + 1;
            if (i + 1 < r) update(i + 1, j, pq, nextStep, moveTime, minimumTime);
            if (i - 1 >= 0) update(i - 1, j, pq, nextStep, moveTime, minimumTime);
            if (j - 1 >= 0) update(i, j - 1, pq, nextStep, moveTime, minimumTime);
            if (j + 1 < c) update(i, j + 1, pq, nextStep, moveTime, minimumTime);
            if (minimumTime[r - 1][c - 1] != Integer.MAX_VALUE) return minimumTime[r - 1][c - 1] + 1;
        }
        return minimumTime[r - 1][c - 1] + 1;
    }

    private void update(int i, int j, PriorityQueue<Pair> pq, int nextStep, int[][] moveTime, int[][] minimumTime) {
        if (nextStep < moveTime[i][j]) nextStep = moveTime[i][j];
        if (minimumTime[i][j] > nextStep) {
            pq.add(new Pair(nextStep, i, j));
            minimumTime[i][j] = nextStep;
        }
    }


    private class Pair {
        int steps = 0, i = -1, j = -1;

        public Pair(int steps, int i, int j) {
            this.steps = steps;
            this.i = i;
            this.j = j;
        }
    }
}
