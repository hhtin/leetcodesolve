package vn.tinhh.leetcodesolve.utils;

import org.springframework.stereotype.Component;

@Component
public class AlgorithmUtils {

    //thuật toán quy hoạch động có thể tìm ra tập hợp
    // con có tổng lớn nhất từ tập hợp ban đầu một cách nhanh chóng, tốc độ thực hiện O(n).
    public int kadane(int[] array) {
        int size = array.length;
        int max_ending_hear = 0; // Tổng tại vị trí đang xét
        int max_so_far = 0; // Tổng cuối cùng
        for (int i = 1; i < size; i++) {
            max_ending_hear += array[i];

            if (max_ending_hear <= 0) {
                max_ending_hear = 0;
            } else {
                if (max_so_far < max_ending_hear) {
                    max_so_far = max_ending_hear;
                }
            }
        }
        return max_so_far;
    }
}
