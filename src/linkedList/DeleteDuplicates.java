package linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/14 17:17
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){return head;}
        Set<Integer> set=new HashSet<>();
        set.add(head.val);
        ListNode pre=head;
        ListNode cur=head.next;
        while(cur!=null){
            if(set.contains(cur.val)){
                pre.next=cur.next;
                cur=cur.next;
            }else{
                set.add(cur.val);
                pre=pre.next;
                cur=cur.next;
            }
        }
        return head;
    }
}
