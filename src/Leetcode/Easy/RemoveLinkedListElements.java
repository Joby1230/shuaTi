package Leetcode.Easy;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head==null) return head;
        while (head!=null&&head.val==val){
            head=head.next;
        }
        ListNode pre =null,now=head;

        while (now!=null){
            if (now.val==val){
                ListNode tmp = now;
                pre.next=tmp.next;
                now=tmp.next;
                continue;
            }
            pre=now;
            now=now.next;
        }
        return head;
    }
}
