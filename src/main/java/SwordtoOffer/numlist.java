package SwordtoOffer;

import sun.plugin2.message.GetAppletMessage;

import java.util.*;


public class numlist{

    //找到最大的k个数
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Queue<Integer> maxheap = new PriorityQueue<>();
        Queue<Integer> minheap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        ArrayList<Integer> res = new ArrayList<>();
        if (input.length<k)
            return res;
        for (int i = 0; i < input.length; i++) {
            maxheap.offer(input[i]);
        }
        for (int i = 0; i < k; i++) {
            res.add(maxheap.poll());
        }
        return res;
    }

    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> num_time = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (num_time.containsKey(array[i]))
                num_time.put(array[i],num_time.get(array[i])+1);
            else
                num_time.put(array[i],1);
        }
        for (Map.Entry<Integer,Integer>  x :num_time.entrySet()){
            if (x.getValue()>array.length/2){
                return x.getKey();
            }
        }
        return 0;
    }

    public static void PrintLeastNumbers_Solution(int [] input, int k) {
        Queue<Integer> minheap = new PriorityQueue<>();
        Queue<Integer> maxheap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        if (input.length<k)
            return;
        for (int i = 0; i < input.length; i++) {
            maxheap.offer(input[i]);
            minheap.offer(input[i]);
        }
        for (int i = 0; i < k; i++) {
            System.out.print("max---------"+maxheap.poll());
            System.out.println("min---------"+minheap.poll());
        }
    }

    public static void main(String[] args) {
        int[] aaa={1,2,3,4,5,6,7,8,9,10};
        PrintLeastNumbers_Solution(aaa,3);
    }
}
