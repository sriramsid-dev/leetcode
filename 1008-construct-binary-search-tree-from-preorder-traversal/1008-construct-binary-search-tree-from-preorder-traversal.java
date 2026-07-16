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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++)
        {
            construct(root,preorder[i]);
        }
        return root;
    }
    public void construct(TreeNode root,int val)
    {
        TreeNode n=new TreeNode(val);
        TreeNode temp=root,prev=null;
        while(temp!=null)
        {
            prev=temp;
            if(temp.val>val)
            {
                temp=temp.left;
            }
            else
            {
                temp=temp.right;
            }
        }
        if(prev.val>val)
        {
            prev.left=n;
        }
        else
        {
            prev.right=n;
        }
    }
}