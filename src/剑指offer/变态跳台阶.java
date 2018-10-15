package 剑指offer;

public class 变态跳台阶 {
    public int JumpFloorII(int target) {
        if (target <= 0) return 0;
        else if (target == 1 ) return 1;
        else return (int) Math.pow(2, target - 1);
    }
}
