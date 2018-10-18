package Leetcode.Easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        boolean flag = true;
        while (n != 1) {
            if (!set.contains(n)) {
                set.add(n);
            } else {
                flag = false;
                break;
            }
            n = sum(n);
        }
        return flag;
    }
    public int sum(int n){
        int ans=0;
        while (n!=0){
            int tmp=n%10;
            ans = ans+(int)Math.pow(tmp,2);
            n=n/10;
        }
        return ans;
    }
}
