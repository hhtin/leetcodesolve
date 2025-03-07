package vn.tinhh.leetcodesolve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.tinhh.leetcodesolve.utils.AlgorithmUtils;

@Component
public class Lc2501To2550 {
    @Autowired
    private AlgorithmUtils algorithmUtils;

    //2523
    public int[] closestPrimes(int left, int right) {
        int[] ans = new int[2];
        int pos = 0;
        for (int i = left; i <= right; i++) {
            if (algorithmUtils.isPrime(i)) {
                ans[pos] = i;
                pos++;
                if (pos == 2) {
                    return ans;
                }
            }
        }
        return new int[]{-1, -1};
    }
}
