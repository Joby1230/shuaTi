package 剑指offer;

/**
 * 两种方法
 * 一、笨方法从1到n一次判断
 *
 * 二、从数字规律着手
 */
public class 从1到n整数中1出现的次数 {
    public static void main(String[] args) {
        从1到n整数中1出现的次数 a=new 从1到n整数中1出现的次数();
        System.out.println(a.NumberOf1Between1AndN_Solution(13));
    }
    //笨方法
    public int NumberOf1Between1AndN_Solution(int n) {
        int ans=0;
        for (int i = 0; i <=n ; i++) {
            String tmp = String.valueOf(i);
            for (int j = 0; j <tmp.length() ; j++) {
                if (tmp.charAt(j)=='1'){
                    ans++;
                }
            }
        }
        return ans;
    }
}
