package 网易;

import java.util.Scanner;

public class 藏宝图 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            String s1 =in.nextLine();
            String s2 = in.nextLine();
            if (isSubstr(s1,s2)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
    public static boolean isSubstr(String s1 ,String s2){
        if (s2=="") return true;
        int p=0;
        int l1=s1.length(),l2=s2.length();
        for (int i = 0; i <l1 ; i++) {
            if (s1.charAt(i)==s2.charAt(p)){
                p++;
                if (p==l2) return true;
            }
        }
        return false;
    }
}
