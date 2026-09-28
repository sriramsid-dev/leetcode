class Solution {
    public int missingNumber(int[] nums) {
        int s=(nums.length)*(nums.length+1)/2,s1=0;
        for(int i=0;i<nums.length;i++)
        {
            s1=s1+nums[i];
        }
        return s-s1;
    }
}