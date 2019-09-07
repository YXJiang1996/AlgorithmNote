package stack;

import java.util.Stack;

/**
 * 支持push,pop,top操作，并能在常数时间内检索到最小元素的栈
 */
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack=new Stack<Integer>();
        minStack=new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if(!minStack.isEmpty()&&minStack.peek()<x){
            minStack.push(minStack.peek());
        }else{
            minStack.push(x);
        }
    }

    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }
        throw new RuntimeException("Stack is Empty!");
    }

    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        throw new RuntimeException("Stack is Empty!");
    }
}
