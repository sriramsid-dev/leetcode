class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0,max=0;
        for(int i=0;i<k;i++)
        {
            s=s+nums[i];
        }
        max=s;
        for(int i=1;i<=nums.length-k;i++)
        {
            s=(s+nums[k+i-1])-nums[i-1];
            if(max<s)
            {
                max=s;
            }
        }
        return (double)max/k;
    }
}