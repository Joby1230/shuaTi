package 剑指offer;

public class 重建二叉树 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length != in.length) return null;
        return reBulid(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public TreeNode reBulid(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) return null;
        int root = pre[startPre];//根
        int locateRoot = -1; //中序遍历中根结点的位置
        for (int i = startIn; i <= endIn; i++) {
            if (root == in[i]) {
                locateRoot = i;
                break;
            }
        }
        if (locateRoot == -1) return null;
        TreeNode node = new TreeNode(root);
        node.left = reBulid(pre, startPre + 1, startPre + locateRoot - startIn, in, startIn, locateRoot - 1);
        node.right = reBulid(pre, startPre + locateRoot - startIn + 1, endPre, in, locateRoot + 1, endIn);
        return node;
    }
}