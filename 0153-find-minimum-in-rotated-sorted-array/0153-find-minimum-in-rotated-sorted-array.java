class Solution {
    public int findMin(int[] nums) {
        int k=nums.length-1,low=0,high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==nums[k])
            {
                k=mid;
                break;
            }
            else if(nums[mid]>nums[k])
            {
                low=mid+1;
            }
            else
            {
                k=mid;
                high=mid-1;
            }
        }
        return nums[k];
    }
}