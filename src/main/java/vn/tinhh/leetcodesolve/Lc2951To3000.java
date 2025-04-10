package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Lc2951To3000 {

    //2965
    //https://leetcode.com/problems/find-missing-and-repeated-values/description/
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int lastPos = grid.length * grid[0].length; // số cuôi cung của dãy
        int sumOf1ToLastPos = lastPos * (lastPos + 1) / 2;
        int sumReality = 0;
        List<Integer> listCheckExist = new ArrayList<>();
        int[] rtValue = new int[2];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!listCheckExist.contains(grid[i][j])) {
                    sumReality = sumReality + grid[i][j];
                    listCheckExist.add(grid[i][j]);
                } else {
                    rtValue[0] = grid[i][j];
                }
            }
        }
        rtValue[1] = sumOf1ToLastPos - sumReality;
        return rtValue;
    }

    //2999
    //https://leetcode.com/problems/count-the-number-of-powerful-integers/?envType=daily-question&envId=2025-04-10
    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        int currentNumCheck = 0;
        String checkString = "";
        int checkNum = Integer.parseInt(s);
        long rtValue = 0L;
        if (start <= checkNum && checkNum <= finish) {
            rtValue += 1L;
        }
        if(checkNum>finish){
            return 0;
        }
        while (true) {
            currentNumCheck += 1;
            if (currentNumCheck > limit) {
                break;
            }
            int cacheNumCheck = currentNumCheck;
            while (true) {
                checkString = cacheNumCheck + s;
                checkNum = Integer.parseInt(checkString);
                if (checkNum > finish) {
                    break;
                }
                if (start <= checkNum && checkNum <= finish) {
                    rtValue += 1L;
                }
                cacheNumCheck = cacheNumCheck * 10;
            }
        }
        return rtValue;
    }
}
