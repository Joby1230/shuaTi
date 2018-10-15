package 剑指offer;

import java.util.Scanner;

public class 二叉搜索树的后序遍历序列 {

    public static void main(String[] args) {
        int[] a=new int[]{};
        System.out.println(二叉搜索树的后序遍历序列.VerifySquenceOfBST(a));
    }
    public static boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length==0) return false;
        return judge(sequence,0,sequence.length-1);
    }
    public static boolean judge(int[] a,int begin,int end){
        if (begin>=end) return true;
        int root=a[end];
        int pos=end;
        for (int i = begin; i <end ; i++) {
            if (root<a[i]){
                pos=i;
                break;
            }
        }
        for (int i = pos; i <end ; i++) {
            if (a[i]<root){
                return false;
            }
        }
        return judge(a,begin,pos-begin-1)&&judge(a,pos,end-1);
    }
}
