package 剑指offer;

//重要！！！！！
public class 二叉搜索树与双向链表 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode lastNodeInList =null;
        lastNodeInList=convertNode(pRootOfTree,lastNodeInList);
        TreeNode head=lastNodeInList;
        while (head!=null&&head.left!=null){
            head=head.left;
        }
        return head;
    }
    public TreeNode convertNode(TreeNode node,TreeNode lastNodeInList){
        if (node==null) return lastNodeInList;
        TreeNode currentNode = node;
        lastNodeInList=convertNode(currentNode.left,lastNodeInList);
        currentNode.left=lastNodeInList;
        if (lastNodeInList!=null) lastNodeInList.right=currentNode;
        lastNodeInList=currentNode;
        lastNodeInList=convertNode(currentNode.right,lastNodeInList);
        return lastNodeInList;
    }
}
