package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 方法一常规
 * 方法二放在同一个队列里，降低空间复杂度
 */
public class 丑数 {
    public static void main(String[] args) {
        int ans=GetUglyNumber_Solution(6);
        System.out.println(ans);
    }
    public static int GetUglyNumber_Solution(int index) {
        if (index==0) return 0;
        Queue<Integer> q2=new LinkedList<>();
        Queue<Integer> q3=new LinkedList<>();
        Queue<Integer> q5=new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        q2.add(2);
        q3.add(3);
        q5.add(5);
        ans.add(1);
        while(ans.size()<index){
            int m2 = q2.peek();
            int m3 =q3.peek();
            int m5=q5.peek();
            int min = Math.min(m2,Math.min(m3,m5));
            q2.add(min*2);
            q3.add(min*3);
            q5.add(min*5);
            ans.add(min);
            if (min==m2) q2.poll();
            if (min==m3) q3.poll();
            if (min==m5) q5.poll();
        }
        return ans.get(index-1);
    }

    public int GetUglyNumber_Solution2(int n)
    {
        if(n<=0)return 0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        int i2=0,i3=0,i5=0;
        while(list.size()<n)//循环的条件
        {
            int m2=list.get(i2)*2;
            int m3=list.get(i3)*3;
            int m5=list.get(i5)*5;
            int min=Math.min(m2,Math.min(m3,m5));
            list.add(min);
            if(min==m2)i2++;
            if(min==m3)i3++;
            if(min==m5)i5++;
        }
        return list.get(list.size()-1);
    }
}
