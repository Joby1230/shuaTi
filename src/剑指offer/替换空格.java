package 剑指offer;

public class 替换空格 {

    public String replaceSpace(StringBuffer str) {
        StringBuffer ans=new StringBuffer();
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==' '){
                ans.append("%20");
            }
            else {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        StringBuffer ans=new StringBuffer("da d");
        //System.out.println(new 替换空格().replaceSpace2(ans));
        /*ans.replace(0,0,"qwe");
        System.out.println(ans);
        ans.insert(1,"23");
        System.out.println(ans);
        for (int i = 0; i< ans.length() ; i++) {
            if (ans.charAt(i)=='2'){

            }
        }
        System.out.println(ans);*/
        System.out.println(ans.charAt(1));

    }
    public String replaceSpace2(StringBuffer str) {
        int i=0;
        while (i<str.length()){
            System.out.println(str.length());
            if (str.charAt(i)==' '){
                str.replace(i,i+1,"%20");
                //str.insert(i,"%20");
                //str.deleteCharAt(i);
                //i=0;
            }
            i++;
        }
        return str.toString();
    }
    public String replaceSpace3(StringBuffer str){
       return str.toString().replaceAll(" ","%20");
    }
}
