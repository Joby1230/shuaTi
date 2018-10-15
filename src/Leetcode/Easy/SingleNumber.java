package Leetcode.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 此题十分巧妙，注意异或运算具有交换律
 */
public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber=new SingleNumber();
        int[] arr =new int[]{1,2,2};
        System.out.println(singleNumber.singleNumber(arr));
    }
    public int singleNumber(int[] nums) {
        int ans=0;
        for (int num:nums) {
            ans= ans^num;
        }
        return ans;
    }
}
