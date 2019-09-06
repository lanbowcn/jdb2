package SwordtoOffer;

import algorthods.utl.Scann;

import java.util.Scanner;

/**
 * @Author：lanbow
 * @Date:2019/8/27 13:40
 * @Version 1.0
 */
public class RotateArraymin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    public int minNumberInRotateArray(int [] array) {
        int low = 0;int high = array.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(array[mid]>array[high]){
                low = mid;
            }else if(array[mid]==array[high]){
                high = high-1;
            }else{
                high = mid;
            }
        }
        return array[low];

    }

    public int minNumberInRotateArray2(int [] array) {
        for (int i = 0; i < array.length; i++) {
            while(array[i]>array[i+1])
                return array[i+1];
        }
        return array[0];

    }
}
