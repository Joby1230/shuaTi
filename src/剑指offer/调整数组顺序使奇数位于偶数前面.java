package 剑指offer;

import java.util.ArrayList;
import java.util.List;

public class 调整数组顺序使奇数位于偶数前面 {
    public void reOrderArray(int[] array) {
        List<Integer> ji = new ArrayList<Integer>();
        List<Integer> ou = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                ji.add(array[i]);
            } else {
                ou.add(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (!ji.isEmpty()) {
                array[i] = ji.remove(0);
            } else {
                array[i] = ou.remove(0);
            }
        }
    }

    public void reOrderArray2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] % 2 == 1) {
                        int tmp = array[j];
                        while (j > i) {
                            array[j] = array[j - 1];
                            j--;
                        }
                        array[j] = tmp;
                        i++;
                    }
                }
            }
        }
    }
}
