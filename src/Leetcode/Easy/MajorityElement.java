package Leetcode.Easy;

/**
 * 除了这种解法还有解法2利用位操作 在0到31位bit上每一位进行比较，取0，1多的那一方
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int len =nums.length;
        int cnt=0,res=0;
        for (int i = 0; i < len; i++) {
            if (cnt==0){
                 res=nums[i];
                 cnt++;
            }else if(nums[i]==res){
                cnt++;
            }else {
                cnt--;
            }
        }
        return res;
    }
}
