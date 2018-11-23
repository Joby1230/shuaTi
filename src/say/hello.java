package say;

import java.util.*;

public class hello {
    public int a;
    public static void main(String[] args) {
        Solution a = new Solution();
        int[] sz1 = new int[]{1,1,2};
        int[] sz2 = new int[]{7, 7, 7};
        String s1 = "11", s2 = "1";
        //System.out.println(a.permute(sz1));
        Solution s=new Solution();
        s.a=1;
        int b=2;
        s.ceshi();
        System.out.println(s.a);
        hello t1=new hello();
        t1.foo(s);
        System.out.println(s.a);

        t1.foo2(b);
        System.out.println(b);

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,1);



    }
    public void foo(Solution s){
        s.a++;
    }
    public void foo2(Integer b){
        b++;
    }

}

class Solution {
    public int a;
    public void ceshi(){
        a++;
    }

    List<List<Integer>> list = new LinkedList<List<Integer>>();

    public List<List<Integer>> permute(int[] nums) {
        dfs(nums, 0);
        return list;
    }

    public void dfs(int[] nums, int s) {
        if (s == nums.length) {
            List<Integer> l = new LinkedList<>();
            for (int i = 0; i < nums.length; i++) {
                l.add(nums[i]);
            }
            list.add(l);
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = s; i < nums.length; i++) {
            if (set.contains(nums[i])) continue;
            set.add(nums[i]);

            swap(nums, i, s);
            dfs(nums, s + 1);
            swap(nums, i, s);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
