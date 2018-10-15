package 剑指offer;

import java.util.ArrayList;
import java.util.Collections;

public class 数组中出现次数超过一半的数字 {
    public static void main(String[] args) {
        int[] a=new int[]{2,2,2,1,3,};
        数组中出现次数超过一半的数字 t=new 数组中出现次数超过一半的数字();
        System.out.println(t.MoreThanHalfNum_Solution(a));
    }
    public int MoreThanHalfNum_Solution(int [] array) {
        int ans=array[0];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <array.length; i++) {
            list.add(array[i]);
        }
        Collections.sort(list);
        int sum=1;
        int maxsum=1;
        for (int i = 1; i <array.length ; i++) {
            if (list.get(i-1)==list.get(i)){
                sum++;
                if (sum>maxsum){
                    maxsum=sum;
                    ans=list.get(i);
                }
            }else {
                sum=1;
            }
        }
        if (maxsum>array.length/2){
            return ans;
        }else {
            return 0;
        }
    }
}
