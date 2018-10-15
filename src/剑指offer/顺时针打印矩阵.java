package 剑指offer;

import java.util.ArrayList;
import java.util.List;

public class 顺时针打印矩阵 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int start = 0;
        ArrayList<Integer> list=new ArrayList<>();
        while (columns > start * 2 && rows > start * 2) {
            printMa(list,matrix,rows,columns,start);
            start++;
        }
        return list;
    }
    public void printMa(ArrayList<Integer> list,int[][] m,int rows,int columns,int start){
        int endX=columns-start-1;
        int endY=rows-start-1;
        for (int i = start; i <=endX ; i++) {
            list.add(m[start][i]);
        }
        if (start<endY){
            for (int i = start+1; i <=endY ; i++) {
                list.add(m[i][endX]);
            }
        }
        if (start<endX&&start<endY){
            for (int i = endX-1; i >=start ; i--) {
                list.add(m[endY][i]);
            }
        }
        if (start<endX&&start<endY-1){
            for (int i = endY-1; i >=start+1 ; i--) {
                list.add(m[i][start]);
            }
        }
    }
}
