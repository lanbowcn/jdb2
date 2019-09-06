package SwordtoOffer;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Author：lanbow
 * @Date:2019/8/27 16:06
 * @Version 1.0
 */
public class FindKthToTail {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode findKthToTail_laji(ListNode head,int k) {

        Stack<ListNode> x = new Stack<>();
        if (k<=0){
            return null;
        }
        while (head != null) {
            x.push(head);
            head = head.next;
        }
        for (int i = k; i >0; i--) {
            if (!x.empty())
                x.pop();
        }
        if (x.empty())
            return null;
        else
            return x.peek();
    }

//    public ListNode findKthToTail(ListNode head,int k) {
//
//        int count = 0;
//        ListNode p = head,q = head;
//        while(p!=null){
//            if (i>i)
//        }
//
//    }

    public static void main(String[] args) {

    }
}
