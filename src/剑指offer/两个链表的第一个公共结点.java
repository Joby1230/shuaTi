package 剑指offer;

import java.util.Stack;

/**
 * 方法一：常规方法，压栈
 *
 * 方法二：找出2个链表的长度，然后让长的先走两个链表的长度差，然后再一起走
 * （因为2个链表用公共的尾部）
 *
 */
public class 两个链表的第一个公共结点 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Stack<ListNode> st1=new Stack<>();
        Stack<ListNode> st2=new Stack<>();
        while (pHead1!=null){
            st1.push(pHead1);
            pHead1 =pHead1.next;
        }
        while (pHead2!=null){
            st2.push(pHead2);
            pHead2 =pHead2.next;
        }
        ListNode ans=null;
        while (!st1.isEmpty()&&!st2.isEmpty()){
            if (st1.peek().val==st2.peek().val){
                ans =st1.pop();
                st2.pop();
                continue;
            }else {
                break;
            }
        }
        return ans;
    }
}
