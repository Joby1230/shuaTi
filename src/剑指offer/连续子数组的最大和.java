package 剑指offer;

public class 连续子数组的最大和 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max=array[0];
        int[] dp =new int[array.length];
        dp[0]=array[0];
        for (int i = 1; i <array.length ; i++) {
            dp[i] = Math.max(dp[i-1]+array[i],array[i]);
            max=Math.max(dp[i],max);
        }
        return max;
    }
}
