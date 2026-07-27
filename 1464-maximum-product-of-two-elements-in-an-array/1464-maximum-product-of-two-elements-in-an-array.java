class Solution {
    public int maxProduct(int[] nums) {
        int m=0,sm=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=m)
            {
                sm=m;
                m=nums[i];
            }
            else if(nums[i]>sm&&nums[i]<m)
            {
                sm=nums[i];
            }
        }
        int p=(m-1)*(sm-1);
        return p;
    }
}