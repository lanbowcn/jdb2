package SwordtoOffer.diffcult;

import algorthods.utl.Scann;

import java.util.*;

/**
 * @Author：lanbow
 * @Date:2019/9/3 15:57
 * @Version 1.0
 */
public class Dajimu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] num = new int[n][2];
        for (int i = 0; i < n; i++) {
            num[i][0] = sc.nextInt();
            num[i][1] = sc.nextInt();
        }
        Arrays.sort(num,((o1, o2) -> o1[0]-o2[0]));
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = num[i][1];
        }

        System.out.println(LISbp(arr,n));
    }

    private static int LISbp(int[] arr, int n) {
        int k = 0;
        int[] top = new  int[n];
        top[k] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i]>=top[k]){
                top[++k]=arr[i];
            }else{
                int index = binarySerach(top,0,k,arr[i]);
                top[index] = arr[i];
            }
        }
        return k+1;
    }

    private static int binarySerach(int[] arr, int l, int r, int val) {
        while (l!=r){
            int mid = (l+r)>>>1;
            if (val<arr[mid]){
                r = mid;
            }else
                l=mid+1;
        }
        return l;
    }


}

