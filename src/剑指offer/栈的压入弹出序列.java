package 剑指offer;

import java.util.Stack;

public class 栈的压入弹出序列 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA == null) return false;
        Stack<Integer> s = new Stack<>();
        int p = 0;
        for (int i = 0; i < pushA.length; i++) {
            s.push(pushA[i]);
            while (!s.isEmpty() && s.peek() == popA[p]) {
                p++;
                s.pop();
            }
        }
        if (!s.isEmpty() || p != popA.length) {
            return false;
        } else {
            return true;
        }
    }
}
