package Leetcode.Dp;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum=0;
        int n=triangle.size();
        int[] dp = new int[n+1];
        for (int i = n-1; i >=0 ; i--) {
            List<Integer> tmp=triangle.get(i);
            for (int j = 0; j <tmp.size() ; j++) {
                dp[j]=Math.min(dp[j],dp[j+1])+tmp.get(j);
            }
        }
        return dp[0];
    }
}
