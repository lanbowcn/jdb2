package jdbc;

import java.util.Stack;

/**
 * @Author：lanbow
 * @Date:2019/8/29 22:30
 * @Version 1.0
 */
public class PrintbT {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }
    public static void preprint0(Node head){
        if(head!=null){
            System.out.print(head.value);
            preprint0(head.left);
            preprint0(head.right);
        }else
            return;
    }

    public static void midprint0(Node head){
        if (head == null)
            return;

        midprint0(head.left);
        System.out.print(head.value);
        midprint0(head.right);
    }
    public static void posprint0(Node head){
        if (head == null)
            return;

        posprint0(head.left);
        posprint0(head.right);
        System.out.print(head.value);
    }

    public static void preprint(Node head){
        if(head!=null){
            Stack<Node> stack = new Stack<>();
            stack.push(head);
            while(!stack.isEmpty()){
                head = stack.pop();
                System.out.print(head.value);
                if (head.right!=null)
                    stack.push(head.right);
                if (head.left!=null)
                    stack.push(head.left);
            }
        }
        System.out.println();
    }
    public static void midprint(Node head){
        if(head!=null){
            Stack<Node> stack = new Stack<>();
            while(!stack.isEmpty()||head!=null){
                if (head!=null) {
                    stack.push(head);
                    head = head.left;
                }else{
                    head = stack.pop();
                    System.out.print(head.value);
                    head = head.right;
                }

            }
        }
        System.out.println();
    }
    public static void posprint(Node head){
        if(head!=null){
            Stack<Node> stack = new Stack<>();
            Stack<Node> s2 = new Stack<>();
            stack.push(head);
            while(!stack.isEmpty()){
                head = stack.pop();
                s2.push(head);
                if (head.left!=null)
                    stack.push(head.left);
                if(head.right!=null)
                    stack.push(head.right);
            }
            while(!s2.isEmpty()){
                System.out.print(s2.pop().value);
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.left = new Node(3);
        head.right = new Node(8);
        head.left.left = new Node(2);
        head.left.right = new Node(4);
        head.left.left.left = new Node(1);
        head.right.left = new Node(7);
        head.right.left.left = new Node(6);
        head.right.right = new Node(10);
        head.right.right.left = new Node(9);
        head.right.right.right = new Node(11);


        // unrecursive
        System.out.println("============unrecursive=============");
        preprint(head);
        preprint0(head);
        System.out.println();
        midprint(head);
        midprint0(head);
        System.out.println();
        posprint(head);
        posprint0(head);

//        inOrderUnRecur(head);
//        posOrderUnRecur1(head);
//        posOrderUnRecur2(head);

    }
}
