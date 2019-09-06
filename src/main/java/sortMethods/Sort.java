package sortMethods;

import java.util.Arrays;

public class Sort {
    //插入排序
    public static int[] insertionSort(int[] array){
        if(array.length==0)
            return array;
        int curr;
        for (int i = 0; i < array.length-1; i++) {
            curr = array[i+1];
            int preIndex = i;
            while(preIndex >= 0 && curr < array[preIndex]){
                array[preIndex+1]=array[preIndex];
                preIndex--;
            }
            array[preIndex+1] = curr;
        }
        return array;
    }
    //冒泡排序
    public static int[] bubbleSort(int[] array){
        if(array.length==0)
            return array;
        //n次从头到尾有序交换
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        return array;
    }

    //选择排序
    public static int[] selectSort(int[] array){
        if(array.length==0)
            return array;
        //n次从头到尾有序交换
        for (int i = 0; i < array.length-1; i++) {
            int minindex= i;
            for (int j = i; j < array.length; j++) {
                if(array[j] < array[minindex])
                    minindex=j;
            }
            int temp = array[i];
            array[i]=array[minindex];
            array[minindex]= temp;
        }

        return array;
    }

    //希尔排序???
    public static int[] shellSort(int[] array){
        if(array.length==0)
            return array;
        int len = array.length;
        int temp,gap = len/2;
        while(gap>0){
            for (int i = gap; i < len; i++) {
                temp =array[i];
                int preindex = i-gap;
                while(preindex>=0 && array[preindex]>temp){
                    array[preindex+gap] = array[preindex];
                    preindex=preindex-gap;
                }
                array[preindex+gap] = temp;

            }
            gap/=2;
        }

        return array;
    }

    //归并排序
    public static int[] mergeSort(int[] array){
        if(array.length==0)
            return array;

        int mid=array.length/2;

        int[] left = Arrays.copyOfRange(array,0,mid);
        int[] right = Arrays.copyOfRange(array,mid,array.length);
        return merge(mergeSort(left),mergeSort(right));

    }
    private static int[] merge(int[] left,int[] right){
        int[] result = new int[left.length+right.length];
        for (int index = 0,i=0,j=0; index < result.length; index++) {
            if (i>=left.length)
                result[index] = right[index-i];
            else if(j>=right.length)
                result[index] = left[index-j];
            else if(left[i]>right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }
}

