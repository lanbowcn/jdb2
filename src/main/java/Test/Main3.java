package Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/9/3 20:04
 * @Version 1.0
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/9/3 20:04
 * @Version 1.0
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] num = new int[n][2];
        for (int i = 0; i < n; i++) {
            num[i][0] = sc.nextInt();
            num[i][1] = sc.nextInt();
        }
        Arrays.sort(num,(o1,o2)->o1[0]-o2[0]);

        int[] top = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int target = num[i][1];

            int l = 0;
            int r = count;
            if (top[r]<target){
                l=count;
            }else{
                while(l<r){
                    int mid = (l+r)>>>1;
                    if (top[mid]>target)
                        r=mid;
                    else
                        l=mid+1;
                }
            }
            if (l==count)
                count++;
            top[l] = target;
        }
        System.out.println(count);
    }
}

