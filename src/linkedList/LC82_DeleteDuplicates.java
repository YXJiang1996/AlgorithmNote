package linkedList;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/14 17:28
 */
public class LC82_DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head){
        if(head==null){return null;}
        if(head.next!=null&&head.val==head.next.val){
            while(head!=null&&head.next!=null&&head.val==head.next.val){
                head=head.next;
            }
            return deleteDuplicates(head.next);
        }else{
            head.next=deleteDuplicates(head.next);
        }
        return head;
    }
}
