package 剑指offer;

public class 树的子结构 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {

        boolean result = false;
        if(root1!=null&&root2!=null){
            if (root1.val==root2.val){
                result=travel(root1,root2);
            }
            if (!result){
                result=HasSubtree(root1.left,root2);
            }
            if (!result){
                result = HasSubtree(root1.right,root2);
            }
        }
        return result;
    }

    public boolean travel(TreeNode root1,TreeNode root2){
        if (root2==null) return true;
        if (root1==null)return false;
        if (root1.val!=root2.val) return false;
        return travel(root1.left,root2.left)&&travel(root1.right,root2.right);
    }



}
