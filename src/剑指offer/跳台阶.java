package 剑指offer;

public class 跳台阶 {
    public int JumpFloor(int target) {
        if (target==1)return 1;
        int[]ans = new int[target];
        ans[0]=1;
        ans[1]=1;
        for (int i = 2; i <=target ; i++) {
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans[target];
    }
}
