package 剑指offer;

import java.util.Stack;

public class 包含min函数的栈 {
    Stack<Integer> data = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int node) {
        if (data.isEmpty()) {
            data.push(node);
            min.push(node);
        }else {
            data.push(node);
            if (node<min.peek()){
                min.push(node);
            }else {
                min.push(min.peek());
            }
        }
    }

    public void pop() {
        data.pop();
        min.pop();
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }
}
