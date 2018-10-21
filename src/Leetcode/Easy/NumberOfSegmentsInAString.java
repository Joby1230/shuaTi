package Leetcode.Easy;

public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        //判断字符串是否长度为0或者都是空格，如果是则字段为0
        if(s.length()==0||s.trim().isEmpty()) return 0;
        //把字符串两端的空格都去掉
        String str=s.trim();
        int j=0;
        for(int i=0;i<str.length();i++){
            //空格减去‘A’是-33.如果这个字符是空格，但是下一个字符不是空格，则是一个字段
            if(str.charAt(i)-'A'==-33&&str.charAt(i+1)-'A'!=-33)
                j++;
        }
        if(j==0) return 1;
        else return j+1;
    }
}
