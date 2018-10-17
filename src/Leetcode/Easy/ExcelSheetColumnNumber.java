package Leetcode.Easy;

/**
 *  还有一种方法可以写成
 *  ans = (ans*26) + arr[i] -'A' +1;
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int ans=0;
        for (int i = 0; i <s.length() ; i++) {
            int index = s.length()-1-i;
            ans = ans + (int)Math.pow(26,i) * (s.charAt(index)-'A'+1);
        }
        return ans;
    }
}
