package Test;

/**
 * @Author：lanbow
 * @Date:2019/9/3 16:54
 * @Version 1.0
 */


import java.util.Scanner;


public class Main2 {
    //矩阵最小路径和
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n = sc.nextInt();
        int[][] map = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int res = caluMinpath(map,m,n);
        System.out.println(res);
    }

    private static int caluMinpath(int[][] map, int m, int n) {
        int[][] path = new int[m][n];
        path[0][0] = map[0][0];
        for (int i = 1; i < n; i++) {
            path[0][i] = path[0][i-1]+map[0][i];
        }
        for (int i = 1; i < m; i++) {
            path[i][0] = path[i-1][0]+map[i][0];
        }
        for (int i = 1; i < m ; i++) {
            for (int j = 1; j < n ; j++) {
                path[i][j] = Math.min(path[i-1][j],path[i][j-1])+map[i][j];
            }
        }

        return path[m-1][n-1];
    }
}
