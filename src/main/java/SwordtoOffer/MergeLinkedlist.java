package SwordtoOffer;

/**
 * @Author：lanbow
 * @Date:2019/9/3 10:46
 * @Version 1.0
 */
public class MergeLinkedlist {
    public static ListNode Merge(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode head = res;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }

        if (list1 == null) {
            head.next = list2;

        } else if (list2 == null) {
            head.next = list1;

        }
        return res.next;
    }

    public static void main(String[] args) {
        int[] list1 = {1, 3, 5};
        int[] list2 = {2, 4, 6};
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);
        ListNode input1 = head1;
        ListNode input2 = head2;
        for (int x : list1) {
            ListNode next = new ListNode(x);
            head1.next = next;
            head1 = head1.next;
        }
        for (int x : list2) {
            ListNode next = new ListNode(x);
            head2.next = next;
            head2 = head2.next;
        }

        ListNode.printListedList(input1.next);
        ListNode.printListedList(input2.next);


        ListNode.printListedList(Merge(input1.next, input2.next));


    }
}