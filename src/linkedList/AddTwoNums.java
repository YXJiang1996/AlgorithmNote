package linkedList;

/**
 * 相加两个链表逆序表示非负整数，返回一个链表
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/10 15:11
 */
public class AddTwoNums {
    public static void main(String[] args) {
        ListNode l1=new ListNode(5);
        ListNode l2=new ListNode(5);
        ListNode result=addTwoNumbers(l1,l2);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode p = head, p1 = l1, p2 = l2;
        int flag = 0;
        while (p1 != null || p2 != null) {
            int v1 = (p1 != null) ? p1.val : 0;
            int v2 = (p2 != null) ? p2.val : 0;
            int temp = (v1 + v2 + flag) >= 10 ? (v1 + v2 + flag) % 10 : (v1 + v2 + flag);
            flag = (v1 + v2 + flag) >= 10 ? 1 : 0;
            p.next = new ListNode(temp);
            p = p.next;
            p1 = p1!= null ? p1.next : null;
            p2 = p2!= null ? p2.next : null;
        }
        if(flag==1){p.next=new ListNode(1);}
        return head.next;
    }

}
