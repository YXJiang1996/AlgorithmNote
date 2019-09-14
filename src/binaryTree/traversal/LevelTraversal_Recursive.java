package binaryTree.traversal;

import binaryTree.traversal.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的层次遍历，递归方法
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/14 14:47
 */
public class LevelTraversal_Recursive {
    private List<List<Integer>> result=new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){return result;}
        levelTrace(root,0);
        return result;
    }

    public void levelTrace(TreeNode root,int level){
        if(result.size()==level){
            result.add(new ArrayList<Integer>());
        }
        result.get(level).add(root.val);
        if(root.left!=null){levelTrace(root.left,level+1);}
        if(root.right!=null){levelTrace(root.right,level+1);}

    }
}
