package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Lc51To100 {

    //75
    //https://leetcode.com/problems/sort-colors/description/?envType=daily-question&envId=2025-05-17
    public void sortColors(int[] nums) {
        int [] c= new int[3];// initializing the frequency array
        for(int n : nums){
            c[n]++;//updating the frequency array
        }
        int in = 0;
        for(int i = 0;i<3;i++){
            while((c[i]--)!=0){
                nums[in++] = i;//updating nums in sorted order
            }
        }
    }
}
