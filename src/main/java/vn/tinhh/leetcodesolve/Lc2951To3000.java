package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Lc2951To3000 {

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
}
