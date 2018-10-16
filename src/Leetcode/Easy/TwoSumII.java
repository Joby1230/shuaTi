package Leetcode.Easy;

/**
 * 因为已经排好序，用这种方法降低时间复杂度
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return null;
    }
}
