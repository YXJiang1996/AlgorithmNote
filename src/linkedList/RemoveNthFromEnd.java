package linkedList;

/**
 * 删除链表中的倒数第N个结点
 * 利用双指针，第一个指针先走N步，到头时第二个指针指向的就是倒数第N个结点
 *
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/7 13:10
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode p1 = node;
        ListNode p2 = node;
        for (int i = 0; i < n; i++) {
            p1 = p1.next;
        }
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return node.next;
    }
}
