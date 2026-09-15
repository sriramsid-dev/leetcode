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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        if(root==null)
        {
            return l;
        }
        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        int c=0;
        while(!q.isEmpty())
        {
            int s=q.size();
            List<Integer> l1=new ArrayList<>();
            for(int i=0;i<s;i++)
            {
                TreeNode temp=q.poll();
                if(temp.left!=null)
                {
                    q.offer(temp.left);
                }
                if(temp.right!=null)
                {
                    q.offer(temp.right);
                }
                l1.add(temp.val);
            }
            if(c%2==0)
            {
                l.add(l1);
            }
            else
            {
                Collections.reverse(l1);
                l.add(l1);
            }
            c++;
        }
        return l;
    }
}