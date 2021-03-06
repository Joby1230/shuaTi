package Leetcode.Dp;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid[0].length, m = obstacleGrid.length;
        int[][] dp = new int[m][n];
        if (obstacleGrid[0][0] == 1) return 0;
        else dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else if (i == 0) {
                    if (j > 0) dp[i][j] = dp[i][j - 1];
                } else if (j == 0) {
                    if (i > 0) dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
