package SwordtoOffer;

import java.util.LinkedList;
import java.util.Queue;

import SwordtoOffer.TreeNode.TreeLinkNode;

/**
 * @Author：lanbow
 * @Date:2019/9/1 13:09
 * @Version 1.0
 */
public class TreePro {
    //    按顺序答应二叉树
    public static void printTree(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            TreeNode curr = que.poll();
            System.out.print(curr.val);
            if (curr.left != null)
                que.offer(curr.left);
            if (curr.right != null)
                que.offer(curr.right);
        }
        System.out.println();
    }
//    操作给定的二叉树，将其变换为源二叉树的镜像。

    public static void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }


        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        Mirror(root.left);
        Mirror(root.right);

    }

    //    给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
    public static TreeLinkNode GetNext(TreeLinkNode pNode) {
        TreeLinkNode temp = pNode;
        if (pNode.right!=null){
            temp = temp.right;
            while(temp.left!=null){
                temp=temp.left;
            }
            return temp;
        }else{
            while(temp.next!=null){
                if (temp==temp.next.left)
                    return temp.next;
                temp=temp.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        printTree(root);
        Mirror(root);
        printTree(root);


    }
}
