package 剑指offer;

/**
 * 递归写法
 * 非递归写法：用层序遍历
 * 非递归写法关键  nextCount初始为1
 * if(count == nextCount){
 *                 nextCount = queue.size();
 *                 count = 0;
 *                 depth++;
 *             }
 */
public class 二叉树的深度 {
    public int TreeDepth(TreeNode root) {
        if (root==null) return 0;
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        return Math.max(left,right)+1;
    }
}
