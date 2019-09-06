package algorthods.practice.Sort;

/**
 * @Author：lanbow
 * @Date:2019/8/25 14:15
 * @Version 1.0
 */
public class BinaryTreeNode {
    private int data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(int val,BinaryTreeNode left,BinaryTreeNode right){
        super();
        this.data = val;
        this.left = left;
        this.right = right;
    }

    public int getData(){
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

}
