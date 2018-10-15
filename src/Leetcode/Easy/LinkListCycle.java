package Leetcode.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 方法1：额外空间存储
 * 方法2：设置快慢指针，若两指针相遇则代表有环。
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class LinkListCycle {

   public  ListNode a =new ListNode(1);

    public static void main(String[] args) {
        LinkListCycle linkListCycle=new LinkListCycle();
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        a.next=a;
        System.out.println(linkListCycle.hasCycle(a));
    }

    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        if (head.next==head) return true;
        Set<ListNode> set=new HashSet<>();
        while (head!=null){
            if (set.contains(head)){
                return false;
            }else {
                set.add(head);
            }
            head=head.next;
        }
        return true;
    }
}
