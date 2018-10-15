package Leetcode.Easy;

import java.util.Stack;

/**
 * 注意min栈的维护方法，比较巧妙
 */
public class MinStack {

    public Stack<Integer> min ;
    public Stack<Integer> st ;
    public MinStack() {
        min =new Stack<>();
        st =new Stack<>();
    }
    public void push(int x) {
        st.push(x);
        if (min.isEmpty()){
            min.push(x);
        }else {
            if (x<min.peek()){
                min.push(x);
            }else {
                min.push(min.peek());
            }
        }
        return;
    }

    public void pop() {
        st.pop();
        min.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
