package algorthods;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/21 18:56
 * @Version 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        int[] zhi = new int[high - low];
        //80%
        for (int i = low; i < high; i++) {
            int j = 2;
            if (i > 2) {
                while (i % j != 0) {
                    j++;
                }
                if (j == i) {
                    zhi[i - low] = i;
                }
            } else {
                zhi[i - low] = i;
            }

        }

        int sum_1 = 0, sum_10 = 0;
        for (int i = 0; i < zhi.length; i++) {
            sum_1 += zhi[i] % 10;
            sum_10 += (zhi[i] / 10) % 10;
        }
        System.out.println(Math.min(sum_1, sum_10));
    }
}
