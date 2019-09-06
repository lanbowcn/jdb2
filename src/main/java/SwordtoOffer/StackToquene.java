package SwordtoOffer;

import java.util.Stack;

/**
 * @Author：lanbow
 * @Date:2019/8/27 13:31
 * @Version 1.0
 */
public class StackToquene {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();

    }
}
