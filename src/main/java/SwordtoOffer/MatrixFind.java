package SwordtoOffer;

/**
 * @Author：lanbow
 * @Date:2019/8/23 15:34
 * @Version 1.0
 */
public class MatrixFind {
    public static boolean find(int target, int[][] arr) {
        if (arr == null || arr.length == 0)
            return false;
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col > 0) {
            if (target > arr[row][col]) {
                row++;
            } else if (target < arr[row][col]) {
                col--;
            } else
                return true;
        }
        return false;
    }

    //输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
    public static void reOrderArray(int[] array) {
        int ji = 0, ou = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int index = j;
                if (array[index] % 2 == 1) {
                    while (index - 1 >= 0 && array[index - 1] % 2 != 1) {
                        int temp = array[index];
                        array[index] = array[index - 1];
                        array[index - 1] = temp;
                        index--;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4, 5},
                {3, 4, 5, 6, 7},
                {4, 6, 8, 9, 10}
        };
        System.out.println(find(1, a));
    }
}
