package Leetcode.Easy;

public class CountBinarySubstrings {
        public int countBinarySubstrings(String s) {
            int[] cnt = new int[s.length()];
            int tmp=0,res=0;
            for (int i = 0; i <s.length()-1 ; i++) {
                cnt[tmp]++;
                if (s.charAt(i)!=s.charAt(i+1)) tmp++;
            }
            cnt[tmp]++;
            for (int i = 0; i <tmp ; i++) {
                res+=Math.min(cnt[i],cnt[i+1]);
            }
            return res;
        }
}
