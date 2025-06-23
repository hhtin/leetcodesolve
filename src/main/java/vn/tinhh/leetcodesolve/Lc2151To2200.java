package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class Lc2151To2200 {

    //2161
    //https://leetcode.com/problems/partition-array-according-to-given-pivot/description/
    public int[] pivotArray(int[] nums, int pivot) {
        // Danh sách nhỏ hơn pivot (theo thứ tự đúng)
        int[] before = new int[nums.length];
        // Danh sách lớn hơn pivot (theo thứ tự đúng)
        int[] after = new int[nums.length];
        // Danh sách pivot để đến số lượng pivot trong int[] nums
        int[] pivots = new int[nums.length];
        // 3 biến để đêm số lượng trong từng mảng
        int countPivots = 0;
        int countBefore = 0;
        int countAfter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                pivots[countPivots] = pivot;
                countPivots++;
            } else if (nums[i] > pivot) {
                after[countAfter] = nums[i];
                countAfter++;
            } else {
                before[countBefore] = nums[i];
                countBefore++;
            }
        }
        // Tạo ra mảng đáp án bằng cách đổ dữ liệu từng mảng vào mảng result
        int[] result = new int[nums.length];
        System.arraycopy(before, 0, result, 0, countBefore);
        System.arraycopy(pivots, 0, result, countBefore, countPivots);
        System.arraycopy(after, 0, result, countBefore + countPivots, countAfter);
        return result;
    }

}
