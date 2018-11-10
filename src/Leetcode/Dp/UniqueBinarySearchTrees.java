package Leetcode.Dp;

/**
 * 重要
 * 再做一遍
 */
public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int layer = 2; layer <=n ; layer++) {
            for (int i = 1; i <=layer ; i++) {
                dp[layer] = dp[layer]+dp[layer-i]*dp[i-1];
            }
        }
        return dp[n];
    }

}
