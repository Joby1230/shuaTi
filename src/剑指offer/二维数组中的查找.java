package 剑指offer;

import java.util.Scanner;

public class 二维数组中的查找 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};

        System.out.println(二维数组中的查找.Find(7, arr));
    }


    public static boolean Find(int target, int[][] array) {
        int row = 0;
        int col = array[0].length-1;
        while (row < array.length && col >= 0) {
            if (target == array[row][col]) return true;
            else if (target > array[row][col]) {
                row++;
            } else if (target < array[row][col]) {
                col--;
            }
        }
        return false;
    }
}
