package linkedList;

/**
 * 两个单向链表的第一个相交节点
 * @author Jiang.YX
 * @date 2019/09/07
 */
public class IntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        int lengthA = 0;
        int lengthB = 0;
        while (p1 != null) {
            lengthA++;
            p1 = p1.next;
        }
        while (p2 != null) {
            lengthB++;
            p2 = p2.next;
        }
        if (lengthA >= lengthB) {
            for (int i = 0; i < lengthA - lengthB; i++) {
                headA = headA.next;
            }
            while (headA != null) {
                if (headA == headB) {
                    return headA;
                }
                headA = headA.next;
                headB = headB.next;
            }
        } else {
            for (int i = 0; i < lengthB - lengthA; i++) {
                headB = headB.next;
            }
            while (headA != null) {
                if (headA == headB) {
                    return headA;
                }
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }

}
