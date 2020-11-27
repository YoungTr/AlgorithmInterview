package link;

public class RemoveElements203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode cur = res;
        while (cur.next != null) {
            if (cur.next.val == val) {
                ListNode del = cur.next;
                cur.next = del.next;
            } else {
                cur = cur.next;
            }
        }
        return res.next;
    }
}
