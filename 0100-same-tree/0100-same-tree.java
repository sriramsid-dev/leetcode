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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isidentical(p,q);
    }
    public boolean isidentical(TreeNode p,TreeNode q)
    {
        if(p==null && q==null)
        {
            return true;
        }
        if((p==null && q!=null)||(p!=null &&q==null)||p.val!=q.val)
        {
            return false;
        }
        return isidentical(p.left,q.left) && isidentical(p.right,q.right);
    }
}