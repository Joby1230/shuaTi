package Leetcode.Dp;

/**
 * 需要再仔细看看
 */
public class DecodeWays {
    public int numDecodings(String s) {
        if (s.length()==0||s==null) return 0;
        int n=s.length();
        int[] dp=new int[n+1];
        dp[0]=1;
        if (s.charAt(0)!='0') dp[1]=1;
        for (int i = 2; i <=n ; i++) {
            int tmp1=Integer.parseInt(s.substring(i-1,i));
            int tmp2=Integer.parseInt(s.substring(i-2,i));
            if (tmp1>=1&&tmp1<=9) dp[i]=dp[i]+dp[i-1];
            if (tmp2>=10&&tmp2<=26) dp[i] =dp[i]+dp[i-2];
        }
        return dp[n];
    }
}
