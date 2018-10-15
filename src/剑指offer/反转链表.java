package 剑指offer;

public class 反转链表 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode ReverseList(ListNode head) {
            if (head==null) return null;
            ListNode pre =null,now=head;
            while (now.next!=null){
                ListNode tmp=now.next;
                now.next=pre;
                pre=now;
                now=tmp;
            }
            now.next=pre;
            return now;
        }
        public ListNode ReverseList2(ListNode head) {
            if (head==null) return null;
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
}
