package Leetcode.medium;

/**
 * 依靠数学公式的推导
 */
public class RotateFunction {
    public int maxRotateFunction(int[] A) {
        int f=0,sum=0;
        for (int i = 0; i <A.length ; i++) {
            f+=i*A[i];
            sum+=A[i];
        }
        int ans=f;
        for (int i = A.length-1; i >0 ; i--) {
            int f2=f+sum-A.length*A[i];
            ans=Math.max(ans,f2);
            f=f2;
        }
        return ans;
    }
}
