package Leetcode.Dp;

import 剑指offer.TreeNode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * 不求甚解
 * 不理解的题
 */
public class UniqueBinarySearchTreesII {
    public static void main(String[] args) {
        UniqueBinarySearchTreesII u=new UniqueBinarySearchTreesII();
        System.out.println(u.generateTrees(3));

        double a=1.1;
        float b=(float) 1.1;
        BigDecimal c =new BigDecimal("0.10");
        BigDecimal d =new BigDecimal("0.10");
        System.out.println(a==b);
        System.out.println(c.equals(d));

        ceshi1 c1= new ceshi1(1,2);
        ceshi1 c2 = new ceshi1(1,2);
        ceshi1 c3 =new ceshi1(1);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(new ceshi1(1)));
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
class ceshi1{
    int f;
    int last;
    public ceshi1(int a,int b){
        this.f=a;
        this.last=b;
    }

    public ceshi1(int a){
        this.f=a;
        this.last=1;
    }
    public boolean equals(ceshi1 obj) {
        return this.f==obj.f;
    }
}