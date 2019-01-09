package 剑指offer;

public class 二叉树的镜像 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public void Mirror(TreeNode root) {
        if (root==null) return;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right=tmp;
        Mirror(root.left);
        Mirror(root.right);
    }


    public void Mirror1(TreeNode root) {
        if (root == null) {
            return;
        }
        in(root);
    }

    private void in(TreeNode root) {
        if (root == null) {
            return;
        }
        in(root.left);
        TreeNode tem = root.right;
        root.right = root.left;
        root.left = tem;
        in(root.left);
    }
    private void post(TreeNode root) {
        if (root == null) {
            return;
    }
        post(root.left);
        post(root.right);
        TreeNode tem = root.left;
        root.left = root.right;
        root.right=tem;
    }
}