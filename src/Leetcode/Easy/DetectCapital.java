package Leetcode.Easy;

/**
 * 用自己的方法用时过长
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.length()==1) return true;
        int flag=0;
        if (isUupper(word.charAt(0))) flag=1;
        for (int i = 1; i <word.length() ; i++) {
            if (isUupper(word.charAt(i))){
                if (flag==0) return false;
                else {
                    flag++;
                }
            }
        }
        if (flag!=word.length()&&flag!=0&&flag!=1) return false;
        return true;
    }
    boolean isUupper(char c){
        return c>='A'&&c<='Z';
    }
}
