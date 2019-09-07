package linkedList;

/**
 * 判断一个链表中是否有环
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/7 12:41
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode p1=head;
        ListNode p2=head;
        while(p1!=null&&p1.next!=null&&p1.next.next!=null){
            p1=p1.next.next;
            p2=p2.next;
            if(p1==p2){
                return true;
            }
        }
        return false;
    }
}
