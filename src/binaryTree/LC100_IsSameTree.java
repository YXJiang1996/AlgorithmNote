package binaryTree;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/14 18:17
 */
public class LC100_IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }else if(p!=null&&q!=null){
            return p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }else{
            return false;
        }
    }
}
