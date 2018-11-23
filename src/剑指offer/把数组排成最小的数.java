package 剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 笨方法：全排列一个一个比较
 * 注意点：考虑到排列起来时候的大数问题=》转换成字符串
 */
public class 把数组排成最小的数 {
    public String PrintMinNumber(int [] numbers) {
        List<String> st = new ArrayList<>();
        for (int a : numbers) {
            String tmp = Integer.toString(a);
            st.add(tmp);
        }

    }
}
