package Leetcode.Easy;

/**
 * 注意原点的移动
 */
public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        System.out.println(excelSheetColumnTitle.convertToTitle(28));
    }
    public String convertToTitle(int n) {
        char[] arr = new char[27];
        for (int i = 0; i <26 ; i++) {
            arr[i]= (char)('A'+i);
        }
        StringBuffer ans=new StringBuffer();
        while (n!=0){
            int yushu = (n-1) % 26 ;
            n=(n-1)/26;
            //ans = ans.append(Character.toString(arr[yushu]));
            ans=ans.insert(0,arr[yushu]);
        }
        return ans.toString();
    }
}

