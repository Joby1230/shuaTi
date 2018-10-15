package 剑指offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 从尾到头打印链表 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack =new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ListNode pre=null ,now=listNode;
        while (now!=null){
            ListNode tmp = now.next;
            now.next=pre;
            pre=now;
            now=tmp;
        }
        listNode = pre;
        ArrayList<Integer> list=new ArrayList<>();
        while (listNode!=null){
            list.add(listNode.val);
            listNode=listNode.next;
        }
        return list;
    }
}
