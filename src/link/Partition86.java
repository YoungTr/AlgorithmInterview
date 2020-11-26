package link;

public class Partition86 {
    public ListNode partition(ListNode head, int x) {

        // 添加虚节点
        ListNode con = new ListNode(0), tail = new ListNode(0);
        ListNode p1 = con;
        ListNode p2 = tail;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val < x) {
                con.next = temp;
                con = con.next;
            } else {
                tail.next = temp;
                tail = tail.next;
            }
            temp = temp.next;
        }
        // 最后一个节点置空，可能连接其他元素
        tail.next = null;
        con.next = p2.next;
        return p1.next;
    }
}
