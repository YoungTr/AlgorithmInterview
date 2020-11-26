package link;

public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = result;

        int odd = 0;
        while (l1 != null || l2 != null) {
            int n1 = 0;
            int n2 = 0;
            if (l1 != null) {
                n1 = l1.val;
            }

            if (l2 != null) {
                n2 = l2.val;
            }

            int sum = n1 + n2 + odd;
            result.next = new ListNode(sum % 10);
            result = result.next;
            odd = sum / 10;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (odd != 0) {
            result.next = new ListNode(odd);
        }

        return p.next;
    }
}
