class Solution {
    public int subarraySum(int[] nums, int k) {
        // int j=0,s=0,c=0;
        // if(nums.length==1&&nums[0]==k)return 1;
        // if(nums.length==1&&nums[0]!=k)return 0;
        // for(int i=1;i<nums.length;i++)
        // {
        //     s=nums[j]+nums[i];
        //     if(s==k)
        //     {
        //         c++;
        //         s=0;
        //     }
        //     if(s>k)
        //     {
        //         j=i;
        //     }
        //     if(nums[i]==k)c++;
        // }
        // //if(nums[nums.length-1]==k)c++;
        // return c;
        // int[] p=new int[nums.length];
        // int[] s=new int[nums.length];
        // p[0]=nums[0];
        // int c=0;
        // s[nums.length-1]=nums[nums.length-1];
        // for(int i=1;i<nums.length;i++)
        // {
        //     p[i]=p[i-1]+nums[i];
        //     if(p[i]==k)c++;
        // }
        // for(int i=nums.length-2;i>=0;i--)
        // {
        //     s[i]=s[i+1]+nums[i];
        //     if(s[i]==k)c++;
        // }
        // if(p[0]==k)c++;
        // if(s[nums.length-1]==k)c++;
        // return c;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int s=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                s=s+nums[j];
                if(s==k)
                {
                    c++;
                }
            }
            if(nums[i]==k)c++;
        }
        return c;
    }
}