package binaryTree;

/**
 * 二叉树的最大深度
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/7 12:47
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }
}
