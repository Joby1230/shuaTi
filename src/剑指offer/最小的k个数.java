package 剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 最小的k个数 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list =new ArrayList<>();
        int len=input.length;
        if (k>len) return list;
        for (int a:input) {
            list.add(a);
        }
        Collections.sort(list);
        for (int i = 0; i <len-k ; i++) {
            list.remove(list.size()-1);
        }
        return list;
    }
}
