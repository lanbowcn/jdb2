package SwordtoOffer;

import java.util.ArrayList;


/**
 * @Author：lanbow
 * @Date:2019/9/3 11:18
 * @Version 1.0
 */
public class Matrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (matrix.length == 0 || matrix[0].length == 0)
            return res;
        int row = matrix.length;
        int col = matrix[0].length;
        int round = (Math.min(row, col) + 1) / 2;

        //第一次一次读完一行，第三四条边记得判断重复
        for (int i = 0; i < round; i++) {
            for (int j = i; j < col - i; j++)
                res.add(matrix[i][j]);
            for (int j = i + 1; j < row - i; j++)
                res.add(matrix[j][col - 1 - i]);
            for (int j = col - 2 - i; j > i && row - 1 - i != i; j--)
                res.add(matrix[row - 1 - i][j]);
            for (int j = row - 1 - i; j > i && col - 1 - i != i; j--)
                res.add(matrix[j][i]);
        }
        return res;
    }


    public static void main(String[] args) {
        int[][] in = {{1,2,3,4,5}};
        int[][] in2 = {{1}};
        Matrix m = new Matrix();
        ArrayList<Integer> x = m.printMatrix(in);
        for (int xx : x) {
            System.out.println(xx);
        }
    }
}
