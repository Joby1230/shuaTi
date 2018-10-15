package 网易;

import java.util.Scanner;

public class 分苹果 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int sum=0;
            int n= in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]=in.nextInt();
                sum+=a[i];
            }
            int flag=0,cnt=0;
            if (sum%n!=0) flag=1;
            if (flag==0){
                int avg =sum/n;
                for (int i = 0; i <n ; i++) {
                    int err = Math.abs(avg-a[i]);
                    if ((err&1)!=0){
                        flag=1;
                        break;
                    }
                    cnt = cnt+err;
                }
            }
            if (flag!=0) cnt=-1;
            else cnt = cnt/4;
            System.out.println(cnt);
        }

    }
}
