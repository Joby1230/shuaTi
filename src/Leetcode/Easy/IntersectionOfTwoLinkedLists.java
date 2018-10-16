package Leetcode.Easy;

/**
 * 由左端到右端对齐
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null) return null;
        ListNode p1=headA,p2=headB;
        int len1=0,len2=0;
        while (p1!=null){
            len1++;
            p1=p1.next;
        }
        while (p2!=null){
            len2++;
            p2=p2.next;
        }
        p1=headA;
        p2=headB;
        if (len1<len2){
            int err=len2-len1;
            while (err>0){
                err--;
                p2=p2.next;
            }
        }else {
            int err=len1-len2;
            while (err>0){
                err--;
                p1=p1.next;
            }
        }
        while (p1!=null&&p2!=null){
            if (p1==p2) return p1;
            p1=p1.next;
            p2=p2.next;
        }
        return  null;
    }
}
