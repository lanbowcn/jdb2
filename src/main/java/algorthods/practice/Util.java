package algorthods.practice;

/**
 * @Author：lanbow
 * @Date:2019/8/14 13:32
 * @Version 1.0
 */
public class Util {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
