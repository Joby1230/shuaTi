package Leetcode.Easy;

public class RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        int cnt=0;
        StringBuffer sb = new StringBuffer();
        while (sb.length()<B.length()){
            sb.append(A);
            cnt++;
        }
        if (sb.toString().contains(B)) return cnt;
        sb.append(A);
        cnt++;
        if (sb.toString().contains(B)) return cnt;
        return -1;
    }
}
