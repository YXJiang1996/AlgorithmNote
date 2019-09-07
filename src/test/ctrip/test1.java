package test.ctrip;

import java.util.*;

public class test1 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能
     ******************************开始写代码******************************/
    static ListNode partition(ListNode head,int m) {
//        4
//9 6 3 7 6 5
//3 9 6 7 6 5
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        while(head!=null){
            if(head.val<=m){
                list1.add(head.val);
                head=head.next;
            }else{
                list2.add(head.val);
                head=head.next;
            }
        }
        list1.addAll(list2);
        ListNode node=new ListNode(list1.get(0));
        ListNode p=node;
        for(int i=1;i<list1.size();i++){
            p.next=new ListNode(list1.get(i));
            p=p.next;
        }
        return node;


    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ListNode head=null;
        ListNode node=null;
        int m=in.nextInt();
        while(in.hasNextInt()){
            int v=in.nextInt();
            if(head==null){
                node=new ListNode(v);
                head=node;
            }else{
                node.next=new ListNode(v);
                node=node.next;
            }
        }
        head= partition(head,m);
        if(head!=null){
            System.out.print(head.val);
            head=head.next;
            while(head!=null){
                System.out.print(",");
                System.out.print(head.val);
                head=head.next;
            }
        }
        System.out.println();
    }
}

