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

    public boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;
        // For n=2 or n=3 it will check
        if (n == 2 || n == 3)
            return true;
        // For multiple of 2 or 3 This will check
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        // It will check all the others condition
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
}
