package Leetcode.Easy;

/**
 * 巧解，即求质因子中5的个数
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        /*int ans=0,sum=fac(n);
        String s= Integer.toString(sum);
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==0){
                ans++;
            }
        }
        return ans;*/
        int ans =0;
        while (n>0){
            ans = ans+n/5;
            n= n/5;
        }
        return ans;
    }
    /*public int fac(int n){
        if (n==1) return 1;
        return n*fac(n-1);
    }*/
}
