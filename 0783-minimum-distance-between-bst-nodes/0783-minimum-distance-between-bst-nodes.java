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
    ArrayList<Integer> l;
    public int minDiffInBST(TreeNode root) {
        l=new ArrayList<>();
        inorder(root);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<l.size()-1;i++)
        {
            if(l.get(i+1)-l.get(i)<min)
            {
                min=l.get(i+1)-l.get(i);
            }
        }
        return min;
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);
    }
}