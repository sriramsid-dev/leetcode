class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[nums1.length];
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(nums2[nums2.length-1],-1);
        stack.push(nums2[nums2.length-1]);
        for(int i=nums2.length-2;i>=0;i--)
        {
            if(stack.peek()>nums2[i])
            {
                m.put(nums2[i],stack.peek());
                stack.push(nums2[i]);
            }
            else
            {
                while(stack.size()>0&&stack.peek()<nums2[i])
                {
                    stack.pop();
                }
                if(stack.size()==0)
                {
                    m.put(nums2[i],-1);
                    stack.push(nums2[i]);
                }
                else
                {
                    m.put(nums2[i],stack.peek());
                    stack.push(nums2[i]);
                }
            }
        }
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=m.get(nums1[i]);
        }
        return ans;
    }
}