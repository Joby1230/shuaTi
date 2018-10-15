package 剑指offer;

public class 旋转数组的最小数字 {
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) return 0;
        int min = array[0];
        int mid = 0;
        int p1 = 0;
        int p2 = array.length - 1;
        while (array[p1] >= array[p2]) {
            if (p2 == p1 + 1) {
                min = array[p2];
                break;
            }
            mid = (p1 + p2) / 2;
            if (array[p1] == array[p2] && array[mid] == array[p2]) return findMin(array);
            if (array[mid] >= array[p1]) {
                p1 = mid;
            }
            if (array[mid] <= array[p2]) {
                p2 = mid;
            }
        }
        return min;
    }

    public int findMin(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                min = i + 1;
                break;
            }
        }
        return array[min];
    }
}
