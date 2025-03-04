package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Lc1751To1800 {

    //1780
    public boolean checkPowersOfThree(int n) {
        if (n % 3 == 1) {
            n = n - 1;
        }
        if (n % 3 == 2) {
            return false;
        }
        int sum = 0;
        int pos = 1;
        List<Integer> listPowerOfThree = new ArrayList<>();
        while (sum <= n) {
            int newInt = (int) Math.pow(3, pos);
            sum = sum + newInt;
            listPowerOfThree.add(newInt);
            pos++;
        }
        for (int i = listPowerOfThree.size() - 1; i >= 0; i--) {
            if (n >= listPowerOfThree.get(i)) {
                n = n - listPowerOfThree.get(i);
            }
            if (n == 0) {
                return true;
            }
        }
        return false;
    }
}
