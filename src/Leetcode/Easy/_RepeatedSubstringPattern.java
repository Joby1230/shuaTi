package Leetcode.Easy;

/**
 * 重点掌握
 */
public class _RepeatedSubstringPattern {
    public static void main(String[] args) {
            _RepeatedSubstringPattern a =new _RepeatedSubstringPattern();
            System.out.println(a.repeatedSubstringPattern("abab"));
    }
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for (int i = n/2; i >=1 ; i--) {
            if (n%i==0){
                int c=n/i;
                StringBuffer tmp=new StringBuffer();
                for (int j = 0; j <c ; j++) {
                    tmp.append(s.substring(0,i));
                }
                if (s.equals(tmp.toString())) return true;
            }
        }
        return false;
    }
}
