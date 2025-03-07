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
        int[] ans = new int[]{-1, -1};
        int pos1 = 0;
        int pos2 = 0;
        int currentSpace = 0;
        int smartestPrimeSpace = 0;
        for (int i = left; i <= right; i++) {
            if (algorithmUtils.isPrime(i)) {
                if (pos1 == 0) {
                    pos1 = i;
                } else {
                    pos2 = i;
                    currentSpace = pos2 - pos1;
                    if (smartestPrimeSpace == 0) {
                        smartestPrimeSpace = currentSpace;
                        ans = new int[]{pos1, pos2};
                    }
                    if (currentSpace < smartestPrimeSpace) {
                        smartestPrimeSpace = currentSpace;
                        ans = new int[]{pos1, pos2};
                    }
                    pos1 = i;
                }
            }
        }
        return ans;
    }
}
