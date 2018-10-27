package Leetcode.Dp;

import java.util.ArrayList;

public class NumArray {
    ArrayList<Integer> sum=new ArrayList<>();
    public NumArray(int[] nums) {
        if (nums.length==0) return;
        sum.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            sum.add(nums[i]+sum.get(sum.size()-1));
        }
    }

    public int sumRange(int i, int j) {
        if (i==0) return sum.get(j);
        return sum.get(j)-sum.get(i-1);
    }
}
