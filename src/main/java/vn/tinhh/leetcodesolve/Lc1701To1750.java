package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

@Component
public class Lc1701To1750 {

    //1749
    //https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/description/
    public int maxAbsoluteSum(int[] nums) {
        int size = nums.length;
        int sumInPosPlus = 0; // Giá trị hiện tại của Tổng dương
        int lastSumPlus = 0; // Giá trị lớn nhất của tổng dương

        int sumInPosMinus = 0; // Giá trị hiện tại của Tổng âm
        int lastSumMinus = 0;// Giá trị lớn nhất của tổng âm
        // Chạy vòng for
        for (int i = 0; i < size; i++) {
            // Tính tổng của các giá trị từ num[0] .. đến num[n]
            sumInPosPlus = sumInPosPlus + nums[i];
            // Vì đang tìm mảng phụ liên tiếp lớn nhất
            // nên nếu tổng hiện tại ra là số âm thì reset lại mảng thành 0
            // Vì 0 số dương thì sẽ lớn hơn 1 số âm
            if (sumInPosPlus < 0) {
                sumInPosPlus = 0;
            }
            // Nếu tổng không ra âm thì kiểm tra xem tổng hiện tại có lớn hơn tổng lớn nhất không
            // Nếu lớn hơn thì tổng lớn nhất sẽ = tổng hiện tại
            else {
                if (sumInPosPlus > lastSumPlus) {
                    lastSumPlus = sumInPosPlus;
                }
            }


            // Ngược lại với tìm giá trị lớn nhất của dương thì
            // đây là phần tìm giá trị lớn nhất của âm
            // Do đề bài là tìm giá trị tuyệt đối nên phải tìm số âm lớn nhất
            // và số dương lớn nhát sao đó so sánh để biết được kết quả cuối cùng
            sumInPosMinus = sumInPosMinus + nums[i];
            if (sumInPosMinus > 0) {
                sumInPosMinus = 0;
            } else {
                if (sumInPosMinus < lastSumMinus) {
                    lastSumMinus = sumInPosMinus;
                }
            }

        }
        lastSumMinus = lastSumMinus * (-1);

        if (lastSumPlus > lastSumMinus) {
            return lastSumPlus;
        }
        return lastSumMinus;
    }
}
