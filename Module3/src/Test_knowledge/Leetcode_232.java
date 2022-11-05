package Test_knowledge;

import java.util.Stack;

public class Leetcode_232 {
    /**
    应将类名改为 MyQueue
    private static Stack<Integer> inStack;
    private static Stack<Integer> outStack;
    public MyQueue() {
        inStack = new Stack<Integer>();
        outStack = new Stack<Integer>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if(outStack.empty()){
            in2out();
        }
        return outStack.pop();
    }

    public int peek() {
        if(outStack.empty()){
            in2out();
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.empty() && outStack.empty();

    }
    private void in2out() {
        while(!inStack.empty()){
            outStack.push(inStack.pop());
        }
    }
    **/
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
*/
