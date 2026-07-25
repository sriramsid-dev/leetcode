class Solution {
    //-5 -4 -2 1 2 3
    public int[] rearrangeArray(int[] nums) {
        int[] a=new int[nums.length];
        int i=0,j=1,l=0;
        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]>0)
            {
                a[i]=nums[k];
                i+=2;
            }
            else
            {
                a[j]=nums[k];
                j+=2;
            }
        }
        return a;
    }
}