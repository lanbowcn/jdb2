package SwordtoOffer;

import static algorthods.practice.Util.swap;

/**
 * @Author：lanbow
 * @Date:2019/8/27 15:11
 * @Version 1.0
 */
public class ReorderArray {
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
        int[] x = {1, 2, 3, 4, 5, 6, 7};
        reOrderArray(x);
        for (int i : x)
            System.out.println(i);
    }

}
