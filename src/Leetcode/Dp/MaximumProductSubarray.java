package Leetcode.Dp;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums==null||nums.length==0) return 0;
        int n=nums.length;
        int ans = nums[0];
        int[] maxp=new int[n];
        int[] minp=new  int[n];
        maxp[0]=nums[0];
        minp[0]=nums[0];
        for (int i = 1; i <n ; i++) {
            maxp[i] = Math.max(Math.max(maxp[i-1]*nums[i],minp[i-1]*nums[i]),nums[i]);
            minp[i] = Math.min(Math.min(maxp[i-1]*nums[i],minp[i-1]*nums[i]),nums[i]);
            ans=Math.max(maxp[i],ans);
        }
        return  ans;
    }
}
