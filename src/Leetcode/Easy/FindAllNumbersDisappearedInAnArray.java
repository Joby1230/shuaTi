package Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            int tmp=Math.abs(nums[i]);
            if (nums[tmp-1]>0) nums[tmp-1] = -nums[tmp-1];
        }
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]>0) list.add(i+1);
        }
        return list;
    }
}
