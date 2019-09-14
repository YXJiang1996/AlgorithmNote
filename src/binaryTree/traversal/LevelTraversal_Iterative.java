package binaryTree.traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/14 14:51
 */
public class LevelTraversal_Iterative {
    public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result=new ArrayList<>();
            List<TreeNode> list1=new ArrayList<TreeNode>();
            List<TreeNode> list2=new ArrayList<TreeNode>();
            if(root==null){return result;}
            list1.add(root);
            while(!list1.isEmpty()||!list2.isEmpty()){
                if(!list1.isEmpty()){
                    List<Integer> temp=new ArrayList<Integer>();
                    for (TreeNode node : list1) {
                        temp.add(node.val);
                        if(node.left!=null){list2.add(node.left);}
                        if(node.right!=null){list2.add(node.right);}
                    }
                    result.add(temp);
                    list1.clear();
                }else{
                    List<Integer> temp=new ArrayList<Integer>();
                    for (TreeNode node : list2) {
                        temp.add(node.val);
                        if(node.left!=null){list1.add(node.left);}
                        if(node.right!=null){list1.add(node.right);}
                    }
                    result.add(temp);
                    list2.clear();
                }
            }
            return result;


    }

}
