package Leetcode.Easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome=new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("\"Sue,\" Tom smiles, \"Selim smote us.\""));
    }
    public boolean isPalindrome(String s) {
        if(s==null) return false;
        int flag=0;
        int left=0,right=s.length()-1;
        int err='A'-'a';
        while (left<right){
            while (left<s.length()&&!isEffective(s.charAt(left))){
                left++;
            }
            while (right>=0&&!isEffective(s.charAt(right))){
               right--;
            }
            if (left<=right){
                int l=s.charAt(left);
                int r=s.charAt(right);
                if (l==r){
                    left++;
                    right--;
                    flag=1;
                }else {
                    if ((l-r==err||r-l==err)&&(l>='A'&&l<='Z'||l>='a'&&l<='z')&&(r>='A'&&r<='Z'||r>='a'&&r<='z')){
                        left++;
                        right--;
                        flag=1;
                    } else{
                        return false;
                    }
                }
            }else {
                if (flag==1&&left<s.length()&&right>=0) return true;
            }
        }
        return true;
    }
    public boolean isEffective(char c){
        if (c>='A'&&c<='Z') return true;
        if (c>='a'&&c<='z') return true;
        if (c>='0'&&c<='9') return true;
        return false;
    }
}
