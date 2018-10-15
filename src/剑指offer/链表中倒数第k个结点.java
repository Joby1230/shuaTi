package 剑指offer;

public class 链表中倒数第k个结点 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head==null||k==0) return null;
        ListNode p1=head,p2=head;
        for (int i = 1; i <k ; i++) {
            p2=p2.next;
            if (p2==null) return null;
        }
        while (p2.next!=null){
            p2=p2.next;
            p1=p1.next;
        }
        return p1;
    }
}
