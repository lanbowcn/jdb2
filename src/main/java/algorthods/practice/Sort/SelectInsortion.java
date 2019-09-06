package algorthods.practice.Sort;

import java.util.Arrays;

import static algorthods.practice.Util.swap;

/**
 * @Author：lanbow
 * @Date:2019/8/14 14:09
 * @Version 1.0
 */
public class SelectInsortion {
    public static void selectinsort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int min =i;
            for (int j = i; j < arr.length; j++) {
                min = arr[min]>arr[j]?j:min;
            }
            swap(arr,i,min);
        }
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
            selectinsort(arr1);
            comparator(arr2);
            if(!isEquals(arr1,arr2)){
                succeed = false;
                break;
            }
        }
        System.out.println(succeed?"Yes,you do it!":"Oh no!Please try again,again.");
        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        selectinsort(arr);
        printArray(arr);
    }
}
