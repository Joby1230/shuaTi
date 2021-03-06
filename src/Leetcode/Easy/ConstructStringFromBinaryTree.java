package Leetcode.Easy;

import 剑指offer.TreeNode;

public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode t) {
        if (t == null) return "";
        String result = Integer.toString(t.val);
        String left = tree2str(t.left);
        String right = tree2str(t.right);
        if (left == "" && right == "") return result;
        if (left == "") return result + "()" + "(" + right + ")";
        if (right == "") return result + "(" + left + ")";
        return result + "(" + left + ")" + "(" + right + ")";
    }
}
