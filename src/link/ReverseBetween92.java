package link;

public class ReverseBetween92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode pre = null;
        ListNode cur = head;
        while (m > 1) {
            pre = cur;
            cur = cur.next;
            m--;
            n--;
        }

        ListNode con = pre;
        ListNode tail = cur;
        while (n > 0) {
            ListNode next = cur.next;

            cur.next = pre;
            pre = cur;
            cur = next;

            n--;
        }


        if (con != null) {
            con.next = pre;
        } else {
            head = pre;
        }
        tail.next = cur;

        return head;
    }
}
