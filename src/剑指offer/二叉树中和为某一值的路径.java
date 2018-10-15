package 剑指offer;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 二叉树中和为某一值的路径 {




    public static void main(String[] args) {

        TreeNode node1=new TreeNode(10);
        TreeNode node2=new TreeNode(5);
        TreeNode node3=new TreeNode(12);
        TreeNode node4=new TreeNode(4);
        TreeNode node5=new TreeNode(7);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=null;
        node3.right=null;
        node4.left=null;
        node4.right=null;
        node5.left=null;
        node5.right=null;
        System.out.println(FindPath(node1,15));
    }
   static List<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();

    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root==null) return (ArrayList<ArrayList<Integer>>)lists;

        Stack<Integer> path = new Stack<>();
        find(0,path,root,target);
        return  (ArrayList<ArrayList<Integer>>)lists;
    }
    public static void  find(int sum, Stack<Integer> path, TreeNode root,int target) {
        if (root == null) return;
        int tmp = sum + root.val;

        if (tmp < target) {
            path.push(root.val);
            find(tmp, path, root.left, target);
            find(tmp, path, root.right, target);
            path.pop();
        } else {
            if (tmp > target) {
                return;
            } else {
                if (root.left == null && root.right == null) {
                    path.add(root.val);
                    List<Integer> list= new ArrayList<Integer>();
                    for (int i = 0; i < path.size(); i++) {
                        list.add(path.elementAt(i));
                    }
                    lists.add((ArrayList<Integer>) list);
                    path.pop();
                }
            }
        }
    }
}
