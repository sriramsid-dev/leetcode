/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return issymmetri(root.left,root.right);
    }
    public boolean issymmetri(TreeNode lefti,TreeNode righti)
    {
        if(lefti==null && righti==null)
        {
            return true;
        }
        if((lefti==null &&righti!=null)||(lefti!=null && righti==null)||lefti.val!=righti.val)
        {
            return false;
        }
        return issymmetri(lefti.left,righti.right) && issymmetri(lefti.right,righti.left);
    }
}