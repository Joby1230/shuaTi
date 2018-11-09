package Leetcode.Dp;

import 剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.List;
/*
 * 不求甚解
 * 不理解的题
 */
public class UniqueBinarySearchTreesII {
    public static void main(String[] args) {
        UniqueBinarySearchTreesII u=new UniqueBinarySearchTreesII();
        System.out.println(u.generateTrees(3));
    }
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode>[] res = new List[n+1];
        res[0] = new ArrayList<TreeNode>();
        if (n==0) return res[0];
        res[0].add(null);
        for (int len = 1; len <=n ; len++) {
            res[len]=new ArrayList<TreeNode>();
            for (int j = 0; j <len ; j++) {
                for (TreeNode nodeL: res[j]) {
                    for (TreeNode nodeR:res[len-j-1]) {
                        TreeNode node = new TreeNode(j+1);
                        node.left=nodeL;
                        node.right=clone(nodeR,j+1);
                        res[len].add(node);
                    }
                }
            }
        }
        return res[n];
    }
    private static TreeNode clone(TreeNode n ,int off){
        if (n==null) return null;
        TreeNode node = new TreeNode(n.val+off);
        node.left = clone(n.left,off );
        node.right = clone(n.right,off);
        return node;
    }

}
