package test.vip;

import binaryTree.TreeNode;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/15 18:57
 */
public class test1 {
    private static int max=0;
    public int diameterOfBinaryTree(TreeNode root){
        depth(root);
        return max;
    }
    private int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftDepth=depth(root.left);
        int rightDepth=depth(root.right);
        max=max>leftDepth+rightDepth?max:(leftDepth+rightDepth);
        return (leftDepth>rightDepth?leftDepth:rightDepth)+1;
    }

}
