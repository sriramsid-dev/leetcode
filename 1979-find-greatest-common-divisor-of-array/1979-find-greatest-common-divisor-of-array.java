class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0],c=1,max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
            if(min>nums[i])
            {
                min=nums[i];
            }
        }
        for(int i=2;i<=min;i++)
        {
            if(min%i==0&&max%i==0)
            {
                c=i;
            }
        }
        return c;
    }
}