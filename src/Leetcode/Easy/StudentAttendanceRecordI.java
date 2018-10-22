package Leetcode.Easy;

public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        StudentAttendanceRecordI s=new StudentAttendanceRecordI();
        System.out.println(s.checkRecord("LL"));
    }
    public boolean checkRecord(String s) {
        int aNum=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='A'){
                aNum++;
                if (aNum>1) return false;
            }
            else if (s.charAt(i)=='L') {
                if (i != 0 && i != s.length() - 1) {
                    if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i + 1))
                        return false;
                }
            }
        }
        return true;
    }
}
