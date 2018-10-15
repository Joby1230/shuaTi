package 网易;

import java.util.Scanner;

public class 解救小易 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int[][] a=new int[n][2];
            int[] b=new int[n];
            for (int i = 0; i <2 ; i++) {
                for (int j = 0; j <n ; j++) {
                    a[j][i]=in.nextInt();
                }
            }
            int min = a[0][1]+a[0][0]-2;
            for (int i = 1; i < n; i++) {
                int tmp= a[i][0]+a[i][1]-2;
                if (tmp<min) min=tmp;
            }
            System.out.println(min);
        }
    }
}
