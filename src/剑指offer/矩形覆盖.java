package 剑指offer;

public class 矩形覆盖 {
    public static void main(String[] args) {

        System.out.println(矩形覆盖.RectCover2(4));
    }
    public static int RectCover(int target) {
        if (target<=0) return 0;
        if (target==1) return 1;
        else if (target==2) return 2;
        else return RectCover(target-1)+RectCover(target-2);
    }
    public static int RectCover2(int target) {
        int[] ans = new int[target+1];
        if (target<=0) return 0;
        if (target==1) return 1;
        ans[0]=0;
        ans[1]=1;
        ans[2]=2;
        for (int i = 3; i <=target ; i++) {
            ans[i] = ans[i-1]+ans[i-2];
        }
        return ans[target];
    }

}
