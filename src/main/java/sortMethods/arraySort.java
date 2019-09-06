package sortMethods;

public class arraySort {
    public static void main(String[] args) {
        int[] a = {8,0,5,7,3,4,6,10};
        a=Sort.mergeSort(a);
        for(int i:a)
            System.out.print(i+" ");
    }
}
