package Leetcode.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] zifu =new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        /*Map<String,Integer> map=new HashMap<>();*/
        Set<String> set=new HashSet<>();
        int cnt=0;
        for (int i = 0; i <words.length ; i++) {
            StringBuffer s=new StringBuffer();
            for (char c:words[i].toCharArray()) {
                s.append(zifu[c-'a']);
            }
            set.add(s.toString());
        }
        return set.size();
    }
}
