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
    public int minDepth(TreeNode root) {
        return depth(root);
    }
    public int depth(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int x=depth(root.left);
        int y=depth(root.right);
        if(x==0)
        {
            return y+1;
        }
        if(y==0)
        {
            return x+1;
        }
        return (int)Math.min(x,y)+1;
    }
}