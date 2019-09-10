package test.netease;

import java.util.*;

/**
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/7 19:26
 */
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            List<TreeNode> nodeList = new ArrayList<TreeNode>();
            int[] left = new int[n];
            int[] right = new int[n];
            int[] findRoot = new int[n];
            for (int j = 0; j < n; j++) {
                int value = sc.nextInt();
                nodeList.add(new TreeNode(value));
                left[j] = sc.nextInt();
                right[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                TreeNode node = nodeList.get(j);
                if (left[j] == -1) {
                    node.left = null;
                } else {
                    node.left = nodeList.get(left[j]);
                    findRoot[left[j]] = 1;
                }
                if (right[j] == -1) {
                    node.right = null;
                } else {
                    node.right = nodeList.get(right[j]);
                    findRoot[right[j]] = 1;
                }
                nodeList.set(j, node);
            }
            for (int j = 0; j < n; j++) {
                if (findRoot[j] == 0) {
                    if (judge(nodeList.get(j))) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }

    public static boolean judge(TreeNode node) {
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
        ((LinkedList<TreeNode>) queue1).add(node);
        int upper = 0;
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            if (!queue1.isEmpty()) {
                int current = 0;
                while (!queue1.isEmpty()) {
                    TreeNode temp = queue1.poll();
                    current += temp.val;
                    if(temp.left!=null)queue2.offer(temp.left);
                    if(temp.right!=null)queue2.offer(temp.right);
                }
                if (current <= upper) {
                    return false;
                } else {
                    upper = current;
                }
            } else {
                int current = 0;
                while (!queue2.isEmpty()) {
                    TreeNode temp = queue2.poll();
                    current += temp.val;
                    if(temp.left!=null)queue1.offer(temp.left);
                    if(temp.right!=null)queue1.offer(temp.right);
                }
                if (current <= upper) {
                    return false;
                } else {
                    upper = current;
                }
            }
        }
        return true;
    }
}

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
