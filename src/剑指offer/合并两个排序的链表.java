package 剑指offer;

public class 合并两个排序的链表 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head,now;
        //一定要注意其中一个链表为空的情况
        if (list1==null) return list2;
        if (list2==null) return list1;
        if (list1.val<list2.val){
            head=list1;
            list1=list1.next;
        }
        else {
            head=list2;
            list2=list2.next;
        }
        now=head;
        while (list1!=null||list2!=null){
            if (list1==null) {
                now.next=list2;
                break;
            }
            if (list2==null){
                now.next=list1;
                break;
            }
            if (list1.val<list2.val){
                now.next=list1;
                list1=list1.next;
            }else {
                now.next=list2;
                list2=list2.next;
            }
            now=now.next;
        }
        return head;
    }
}
