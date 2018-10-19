package Leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        return compare(s,t)&&compare(t,s);
    }
    public boolean compare(String s ,String t){
        boolean flag = true;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i), c2 = t.charAt(i);
            if (map.get(c1) == null) {
                map.put(c1, c2);
            } else {
                if (c2 != map.get(c1)) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
