package Leetcode.Easy;

/**
 * 可以写的更简洁一点
 */
public class RotateArray {
    public static void main(String[] args) {
        RotateArray rotateArray=new RotateArray();
        int[] arr = new int[]{1,2,3,4,5,6,7};
        rotateArray.rotate(arr,3);
        for (int a:arr) {
            System.out.println(a);
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int k2=nums.length-k;
        for (int i = 0; i <k2 ; i++) {
            if(i>=k2-i-1)break;
            swith(nums,i,k2-i-1);
        }
        for (int i = k2; i <nums.length ; i++) {
            if (i>=nums.length-(i-k2)-1) break;
            swith(nums,i,nums.length-(i-k2)-1);
        }
        for (int i = 0; i <nums.length/2 ; i++) {
            swith(nums,i,nums.length-i-1);
        }
    }
    public void swith(int[] nums,int i,int j){
        int tmp =nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}

