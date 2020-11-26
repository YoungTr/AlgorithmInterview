package link;

public class OddEvenList328 {

    public ListNode oddEvenList(ListNode head) {
        ListNode left = new ListNode(0), right = new ListNode(0);
        ListNode p1 = left, p2 = right;


        boolean isOdd = true;
        ListNode next = head;
        while (next != null) {
            if (isOdd) {
                left.next = next;
                left = left.next;
            } else {
                right.next = next;
                right = right.next;
            }
            isOdd = !isOdd;
            next = next.next;
        }
        right.next = null;

        left.next = p2.next;
        return p1.next;
    }
}
