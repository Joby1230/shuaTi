package 网易;

import java.util.Scanner;

public class 小q的歌单{
    private static long MOD = 1000000007;
    private static long cmn(int m,int n){
        long fac = 1;
        for(int i=m;i>=m-n+1;i--) {
            fac *= i;
            fac %= MOD;
        }
        for(int i=n;i>=1;i--) {
            fac /=  i;
        }
        return fac;
    }
    public static void main(String[] args) {
        // init
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int f1 = in.nextInt();
        int num1 = in.nextInt();
        int f2 = in.nextInt();
        int num2 = in.nextInt();
        long sum = 0;
        for(int i=0;;i++) {
            if(K-i*f1<0) break;
            int left = K - i*f1;
            if(left % f2 != 0) continue;
            int t = left / f2;
            sum = sum + cmn(num1,i) * cmn(num2,t) %MOD;
        }
        System.out.println(sum);
    }
}
