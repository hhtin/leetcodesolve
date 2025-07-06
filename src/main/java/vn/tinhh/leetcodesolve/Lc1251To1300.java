package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

@Component
public class Lc1251To1300 {

    //1298
    //https://leetcode.com/problems/maximum-candies-you-can-get-from-boxes/?envType=daily-question&envId=2025-06-03
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        boolean[] key = new boolean[candies.length];
        boolean[] isOpenBoxes = new boolean[candies.length];
//        for (int i = 0; i < status.length; i++) {
//            if (status[i] == 1) {
//                isOpenBoxes[i] = true;
//                for (int j = 0; j < keys[i].length; j++) {
//                    key[keys[i][j]] = true;
//                }
//                for (int j = 0; j < containedBoxes[i].length; j++) {
//                    if (key[containedBoxes[i][j]] || status[containedBoxes[i][j]] == 1) {
//                        isOpenBoxes[containedBoxes[i][j]] = true;
//                        for ()
//                    }
//                }
//            }
//        }
        return 0;
    }
}
