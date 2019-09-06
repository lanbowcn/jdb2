package SwordtoOffer.diffcult;

/**
 * @Author：lanbow
 * @Date:2019/9/6 10:40
 * @Version 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nqueen {
    int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new Nqueen().totalNQueens(n));
    }

    public int totalNQueens(int n) {
        if (n < 1) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();

        help(0, n, list);
        return cnt;
    }

    private void help(int row, int n, List<Integer> list) {
        //递归的第一步，列出终止条件，防止死循环
        if (row == n) {
            cnt++;
            return;

        }
        //每一列都尝试一下
        for (int col = 0; col < n; col++) {
            //当前列是否合法
            if (!list.contains(col)) {
                //左斜与右协是否哈法
                if (!isDiagonalAttack(list, col)) {
                    list.add(col);
                    help(row + 1, n, list);
                    //回溯
                    list.remove(list.size() - 1);
                }
            }

        }

    }

    private boolean isDiagonalAttack(List<Integer> currentQueen, int i) {
        int currentRow = currentQueen.size();
        int currentCol = i;
        //判断每一行的皇后的情况
        for (int row = 0; row < currentQueen.size(); row++) {
            //左上角的对角线和右上角的对角线，差要么相等，要么互为相反数，直接写成了绝对值(行差与列差的绝对值进行判断)
            if (Math.abs(currentRow - row) == Math.abs(currentCol - currentQueen.get(row))) {
                return true;
            }
        }
        return false;
    }
}
