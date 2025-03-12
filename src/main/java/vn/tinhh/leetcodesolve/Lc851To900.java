package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class Lc851To900 {

    //873
    //https://leetcode.com/problems/length-of-longest-fibonacci-subsequence/description/
    public int lenLongestFibSubseq(int[] arr) {
        // Tạo ra map với key = giá trị của arr
        // value = vị trí
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            indexMap.put(arr[i], i);
        }
        int firstPos = 0;
        int secondPos = 0;
        int curSum = 0;
        int curCount = 0;
        int largestNumOfArr = arr[arr.length - 1];
        int largestCount = 0;
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                firstPos = i;
                secondPos = j;
                curSum = 0;
                curCount = 0;
                while (largestNumOfArr > curSum) {
                    curSum = arr[firstPos] + arr[secondPos];
                    if (indexMap.containsKey(curSum)) {
                        firstPos = secondPos;
                        secondPos = indexMap.get(curSum);
                        curCount++;
                    } else {
                        break;
                    }
                }
                if (largestCount < curCount) {
                    largestCount = curCount;
                }
            }
        }
        if (largestCount != 0) {
            return largestCount + 2;
        }
        return 0;
    }

}
