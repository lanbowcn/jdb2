package SwordtoOffer;

import java.util.Stack;

/**
 * @Author：lanbow
 * @Date:2019/9/2 9:31
 * @Version 1.0
 */
public class minStack {
    Stack<Integer> num = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int node) {
        num.push(node);
        if (min.isEmpty() || min.peek() > node)
            min.push(node);
        else
            min.push(min.peek());
    }

    public void pop() {
        num.pop();
        min.pop();
    }

    public int top() {
        return num.peek();
    }

    public int min() {
        return min.peek();
    }

    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < popA.length; i++) {
            if (stack.isEmpty())
                stack.push(pushA[j++]);
            while (j < pushA.length && stack.peek()!=popA[i]) {
                System.out.println("yaru"+pushA[j]);
                stack.push(pushA[j]);
                j++;
            }
            if (stack.peek()==popA[i]){
                System.out.println("tanchu"+stack.peek());
                stack.pop();
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5,3,7};
        int[] popA = {4,5,3,2,1,7,3};
        System.out.println(IsPopOrder(pushA,popA));
    }
}
