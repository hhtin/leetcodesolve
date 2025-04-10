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
        long suff = 0L;

        for (char c : s.toCharArray()){
            suff = suff * 10 + c - '0';
        }

        if (suff > finish) return 0;

        long div = (long) Math.pow(10, s.length());
        long ps = start / div;
        long pf = finish / div;

        if (finish % div >= suff) pf++;
        if (start % div > suff) ps++;

        return getAvailNum(pf, limit) - getAvailNum(ps, limit);
    }

    private long getAvailNum(long num, long limit){
        if (num == 0) return 0;
        if (limit == 9) return num;

        int digits = (int) Math.log10(num);
        long div = (long) Math.pow(10, digits);
        long res = 0L;

        for (int i = digits; i >= 0; i--){
            int d = (int) (num / div);

            if (d > limit){
                return res + (long) Math.pow(limit + 1, i + 1);
            } else {
                res += d * (long) Math.pow(limit + 1, i);
            }

            num %= div;
            div /= 10;
        }

        return res;
    }
}
