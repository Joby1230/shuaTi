package Leetcode.Easy;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pre =null,now=head;
        while (now!=null){
            ListNode tmp=now.next;
            now.next=pre;
            pre=now;
            now=tmp;
        }
        return pre;
    }
}
