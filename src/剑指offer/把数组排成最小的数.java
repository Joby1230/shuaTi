package 剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



/**
 * 笨方法：全排列一个一个比较
 * 注意点：考虑到排列起来时候的大数问题=》转换成字符串
 *
 * 方法2：放入list用自定义规则来进行排序
 */
public class 把数组排成最小的数 {
    public static void main(String[] args) {
        把数组排成最小的数 b=new 把数组排成最小的数();
        int[] num=new int[]{3334,3,3333332};
        System.out.println(b.PrintMinNumber1(num));
    }
    public List<String> PrintMinNumber1(int [] numbers) {
        List<String> st = new ArrayList<>();
        for (int a : numbers) {
            String tmp = Integer.toString(a);
            st.add(tmp);
        }
        Collections.sort(st, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)){
                    return 0;
                }else {
                    for (int i = 0; i <o1.length()&&i<o2.length() ; i++) {
                        if (o1.charAt(i)==o2.charAt(i)){
                            continue;
                        }else {
                            if (o1.charAt(i)<o2.charAt(i)){
                                return -1;
                            }else {
                                return 1;
                            }
                        }
                    }
                    if (o1.length()<o2.length()){
                        int n=o1.length();
                        while (n<o2.length()){
                            if (o1.charAt(0)<o2.charAt(n)){
                                return -1;
                            }else{
                                if (o1.charAt(0)>o2.charAt(n)){
                                    return 1;
                                }else {
                                    n++;
                                }
                            }
                        }
                    }else {
                        int n=o2.length();
                        while (n<o1.length()){
                            if (o2.charAt(0)<o1.charAt(n)){
                                return 1;
                            }else{
                                if (o2.charAt(0)>o1.charAt(n)){
                                    return -1;
                                }else {
                                    n++;
                                }
                            }
                        }
                    }
                    return 0;
                }
            }
        });
        return st;
    }
    public String PrintMinNumber(int [] numbers) {
        List<String> st = new ArrayList<>();
        for (int a : numbers) {
            String tmp = Integer.toString(a);
            st.add(tmp);
        }
        Comparator<String> comparator=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)){
                    return 0;
                }else {
                    for (int i = 0; i <o1.length()&&i<o2.length() ; i++) {
                        if (o1.charAt(i)==o2.charAt(i)){
                            continue;
                        }else {
                            if (o1.charAt(i)<o2.charAt(i)){
                                return -1;
                            }else {
                                return 1;
                            }
                        }
                    }
                    if (o1.length()<o2.length()){
                        int n=o1.length();
                        while (n<o2.length()){
                            if (o1.charAt(0)<o2.charAt(n)){
                                return -1;
                            }else{
                                if (o1.charAt(0)>o2.charAt(n)){
                                    return 1;
                                }else {
                                    n++;
                                }
                            }
                        }
                    }else {
                        int n=o2.length();
                        while (n<o1.length()){
                            if (o2.charAt(0)<o1.charAt(n)){
                                return 1;
                            }else{
                                if (o2.charAt(0)>o1.charAt(n)){
                                    return -1;
                                }else {
                                    n++;
                                }
                            }
                        }
                    }
                    return 0;
                }
            }
        };
        Collections.sort(st,comparator);
        StringBuffer sb=new StringBuffer();
        for (String s:st) {
            sb.append(s);
        }
        return sb.toString();
    }
}
