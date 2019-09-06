package SwordtoOffer;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author：lanbow
 * @Date:2019/8/27 15:27
 * @Version 1.0
 */
public class ScreamMid {
    PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
    PriorityQueue<Integer> MinHeap = new PriorityQueue<>();
    int count = 0;

    public void Insert(Integer num) {
        if(count%2==0){
            MinHeap.offer(num);
            MaxHeap.offer(MinHeap.poll());
        }else{
            MaxHeap.offer(num);
            MinHeap.offer(MaxHeap.poll());
        }
        count++;

    }



    public Double GetMedian() {
        if (count%2==0)
            return (double) (MaxHeap.peek() + MinHeap.peek()) / 2;
        else
            return (double) MaxHeap.peek();
    }

    public static void main(String[] args) {
        ScreamMid x = new ScreamMid();

    }
}