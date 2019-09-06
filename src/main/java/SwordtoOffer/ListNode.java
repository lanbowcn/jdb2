package SwordtoOffer;

/**
 * @Author：lanbow
 * @Date:2019/8/31 13:39
 * @Version 1.0
 */
public class ListNode {

    public int val;
    public ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public static void printListedList(ListNode head) {
        System.out.print(head.val);
        while (head.next != null) {
            System.out.print("->" + head.next.val);
            head = head.next;
        }
        System.out.println();
    }
}
