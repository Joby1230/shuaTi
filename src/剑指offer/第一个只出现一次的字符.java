package 剑指offer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class 第一个只出现一次的字符 {

    public int FirstNotRepeatingChar(String str) {
        Map<Character,Integer> mp =new LinkedHashMap<>();
        for (int i = 0; i <str.length(); i++) {
            if (mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i),mp.get(str.charAt(i))+1);
            }else {
                mp.put(str.charAt(i),1);
            }
        }
        int pos =-1;
        for (int i = 0; i <str.length() ; i++) {
            if (mp.get(str.charAt(i))==1){
                pos=i;
                break;
            }
        }
        return pos;
    }
}
