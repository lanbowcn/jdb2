package algorthods.practice.Sort;

import java.util.Arrays;

import static algorthods.practice.Util.swap;

/**
 * @Author：lanbow
 * @Date:2019/8/14 14:49
 * @Version 1.0
 */
public class Quicksort {

    public static void quicksort(int[] arr){
        if (arr==null||arr.length<2)
            return;
        quicksort(arr,0,arr.length-1);
    }

    private static void quicksort(int[] arr, int l, int r) {
        if(l<r){
            swap(arr,r,(int)(l+(r-l+1)*Math.random()));
            int[] p = patition(arr,l,r);
            quicksort(arr,l,p[0]-1);
            quicksort(arr,p[1]+1,r);
        }
    }

    public static int[] patition(int[] arr,int l ,int r){
        int less = l-1,more = r;
        while(l<more){
            if (arr[l]>arr[r]){
                swap(arr,l,--more);
            }else if (arr[l]<arr[r]){
                swap(arr,l++,++less);
            }else{
                l++;
            }
        }
        swap(arr,more,r);

        return new int[]{less+1,more};
    }


    public static void comparator(int arr[]){
        Arrays.sort(arr);
    }

    public static int[] generateRandomArray(int maxSize,int maxValue){
        int[] arr= new int[(int)(Math.random()*(maxSize+1))];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((maxValue+1)*Math.random()-(int)(maxValue*Math.random()));
        }
        return arr;
    }

    public static int[] copyArray(int[] arr){
        if(arr==null)
            return null;
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
        return arr2;
    }

    public static boolean isEquals(int[] arr,int[] arr2){
        if (arr==null&&arr2!=null || arr!=null&&arr2==null){
            return false;
        }
        if (arr==null&&arr2==null){
            return true;
        }
        if (arr.length!=arr2.length){
            return false;
        }else{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]!=arr2[i]){
                    return false;
                }
            }
            return true;
        }
    }

    public static void printArray(int[] arr){
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int testTime=500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed=true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize,maxValue);
            int[] arr2 = copyArray(arr1);
            quicksort(arr1);
            comparator(arr2);
            if(!isEquals(arr1,arr2)){
                succeed = false;
                break;
            }
        }
        System.out.println(succeed?"Yes,you do it!":"Oh no!Please try again,again.");
        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        quicksort(arr);
        printArray(arr);
    }
}
