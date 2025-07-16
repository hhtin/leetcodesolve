package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

@Component
public class Lc3201To3250 {

    //3201
    //https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-i/description/?envType=daily-question&envId=2025-07-16
    public int maximumLength(int[] nums) {
        int oddCount = 0;           // 1. How many odd numbers (chocolates) do we have? 🍫
        int evenCount = 0;          // 2. How many even numbers (caramels) do we have? 🍬
        int alternatingCount = 0;   // 3. Length of our best alternating sequence. ✨
        boolean expectOdd = (nums[0] % 2 == 1); // 4. Are we expecting a chocolate or a caramel first? 🤔 (based on the first candy)

        // 5. Go through each candy (number) in the box...
        for (int num : nums) {
            // 6. Is this candy what we expected for our alternating sequence?
            if ((num % 2 == 1) == expectOdd) {
                alternatingCount++;       // 7. Yes! Add it to the sequence! ➕
                expectOdd = !expectOdd;   // 8. Now we expect the opposite type of candy! 🔄
            }

            // 9. Count ALL the odd and even candies, regardless of the alternating sequence.
            if (num % 2 == 1) {
                oddCount++;               // 10. Another chocolate! 🍫
            } else {
                evenCount++;              // 11. Another caramel! 🍬
            }
        }
        // 12. Which strategy gives us the longest sequence? Alternating? Only Chocolate? Only Caramel?
        return Math.max(alternatingCount, Math.max(oddCount, evenCount)); // Choose the best one! 🎉
    }

    //3208
    //https://leetcode.com/problems/alternating-groups-ii/?envType=daily-question&envId=2025-03-09
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int[] nums = new int[colors.length + k - 1];
        int i = 0;
        for (int e : colors) nums[i++] = e;
        for (int j = 0; j < k - 1; j++) nums[i++] = colors[j];
        int left = 0, right = 0, count = 0;
        while (right < nums.length) {
            if (right != 0 && nums[right] == nums[right - 1]) left = right;
            if (right - left + 1 >= k) {
                count++;

            }
            right++;
        }
        return count;
    }
}
