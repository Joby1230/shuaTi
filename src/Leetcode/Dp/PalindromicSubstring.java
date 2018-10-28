package Leetcode.Dp;

public class PalindromicSubstring {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";
        String res = null;
        boolean[][] dp = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (dp[i + 1][j - 1] || j - i < 3);
                if (dp[i][j] && (res == null || j - i > res.length())) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}
