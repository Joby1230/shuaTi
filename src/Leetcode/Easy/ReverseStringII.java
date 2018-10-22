package Leetcode.Easy;

public class ReverseStringII {
    public String reverseStr(String s, int k) {
        StringBuffer ss = new StringBuffer(s);
        StringBuffer ans = new StringBuffer();
        int n=s.length();
        //if (k>n) return s;
        int num = n/k;
        int left = n%k;
        for (int i = 0; i <num ; i++) {
            if (i%2==0){
                StringBuffer tmp = new StringBuffer(ss.substring(i*k,(i+1)*k));
                ans.append(tmp.reverse());
            }else {
                ans.append(ss.substring(i*k,(i+1)*k));
            }
        }
        if (num%2==0){
            StringBuffer tmp = new StringBuffer(ss.substring(num*k,n));
            ans.append(tmp.reverse());
        }else {
            ans.append(ss.substring(num*k,n));
        }
        return ans.toString();
    }
}
