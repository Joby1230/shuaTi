package Leetcode.Easy;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] flag=new int[128];
        for (int i = 0; i <s.length() ; i++) {
            flag[s.charAt(i)]++;
        }
        for (int i = 0; i <s.length() ; i++) {
            if (flag[s.charAt(i)]==1) return i;
        }
        return -1;
    }
}
