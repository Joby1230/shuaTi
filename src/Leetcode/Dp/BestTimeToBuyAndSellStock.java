package Leetcode.Dp;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0, tmp = 0;
        for (int i = 1; i < prices.length; i++) {
            tmp = Math.max(0, tmp + prices[i] - prices[i - 1]);
            max = Math.max(tmp, max);
        }
        return max;
    }
}
