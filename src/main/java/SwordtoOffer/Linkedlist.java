package SwordtoOffer;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author：lanbow
 * @Date:2019/8/31 12:52
 * @Version 1.0
 */

//链表问题
public class Linkedlist {

    //输入一个链表，输出该链表中倒数第k个结点。
    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        while (fast != null) {
            if (count < k) {
                fast = fast.next;
                count++;
            } else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        if (count < k)
            return null;
        else
            return slow;

    }

    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    // 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    public static ListNode deleteDuplication(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode pre = res;
        ListNode curr = res.next;
        while (curr != null) {
            if (null != curr.next && curr.val == curr.next.val) {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                pre.next = curr.next;
                curr = curr.next;
            } else {
                pre = pre.next;
                curr = curr.next;
            }
        }
        return res.next;
    }

    //给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
    public ListNode EntryNodeofLoop(ListNode head) {
        if(head==null||head.next==null||head.next.next==null){
            return null;
        }
        //判断是否有环
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while(fast!=slow){
            if(fast.next!=null&&fast.next.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }else{
                return null;
            }
        }

        fast = head;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;

    }

    public static void main(String[] args) {
        ListNode start = new ListNode(0);
        int[] list = {1, 2, 3, 3, 4, 4, 5};
        ListNode head = start;
        for (int x : list) {
            ListNode next = new ListNode(x);
            head.next = next;
            head = head.next;
        }
        ListNode input = start.next;
        ListNode.printListedList(input);

        ListNode b = deleteDuplication(input);
        ListNode.printListedList(input);


    }
}
