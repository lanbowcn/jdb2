package SwordtoOffer;

import java.util.ArrayList;

/**
 * @Author：lanbow
 * @Date:2019/8/23 15:52
 * @Version 1.0
 */
public class PrintListFromTailToHead {


    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = listNode;
        ListNode pre  =null;
        ListNode next = null;
        while (curr!=null){
            next=curr.next;
            curr.next=pre;
            pre = curr;
            curr = next;
        }
        while(curr!=null){
            res.add(curr.val);
            curr = curr.next;
        }
        return res;
    }

    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode){
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = listNode;

        while(curr!=null){
            printListFromTailToHead2(curr.next);
            res.add(curr.val);
        }
        return res;
    }

    public int Fibonacci(int n) {
        int a=0,b=1;
        for (int i = 0; i <= n; i++) {
            b+=a;
            a =b-a;
        }
        return a;

    }
    public int JumpFloorII(int target) {
        return (int)Math.pow(2,target-1);
    }
}
