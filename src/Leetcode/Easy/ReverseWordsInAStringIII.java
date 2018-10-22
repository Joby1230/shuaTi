package Leetcode.Easy;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        StringBuffer ans = new StringBuffer();
        int begin=0,end=0,flag=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==' '){
                if (flag==1){
                    flag=0;
                    end=i;
                    StringBuffer tmp=new StringBuffer(s.substring(begin,end));
                    ans.append(tmp.reverse());
                    ans.append(' ');
                }else {
                    ans.append(s.charAt(i));
                    continue;
                }
            }else {
                if (flag==0){
                    flag=1;
                    begin=i;
                }else {
                    continue;
                }
            }
        }
        if (flag==1){
            StringBuffer tmp=new StringBuffer(s.substring(begin,s.length()));
            ans.append(tmp.reverse());
        }
        return ans.toString();
    }
}
