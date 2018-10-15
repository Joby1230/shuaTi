package 剑指offer;

import java.util.HashMap;

public class 复杂链表的复制 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        RandomListNode head, tmp, pHeadTmp = pHead;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        if (pHead == null) return null;
        head = new RandomListNode(pHead.label);
        map.put(pHead, head);

        tmp = head;
        while (pHeadTmp.next != null) {
            tmp.next = new RandomListNode(pHeadTmp.next.label);
            tmp = tmp.next;
            pHeadTmp = pHeadTmp.next;
            map.put(tmp, pHeadTmp);
        }
        tmp.next = null;

        tmp = head;
        pHeadTmp=pHead;
        while (tmp != null) {
            tmp.random = map.get(pHeadTmp.random);
            tmp = tmp.next;
            pHeadTmp=pHeadTmp.next;
        }
        return head;
    }
}
