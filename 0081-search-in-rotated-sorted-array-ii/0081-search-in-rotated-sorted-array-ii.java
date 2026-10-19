class Solution {
    public boolean search(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==k)
        {
            return true;
        }
    }
    return false;
    }
}