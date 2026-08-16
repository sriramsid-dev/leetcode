class Solution {
    public void nextPermutation(int[] nums) {
        int p=-1,i=nums.length-1;
        while(i>0)
        {
            if(nums[i]>nums[i-1])
            {
                p=i-1;
                break;
            }
            i--;
        }
        if(p==-1)
        {
            reverse(nums,p);
        }
        else
        {
            int j=nums.length-1,diff=0,min_diff=Integer.MAX_VALUE,index=p;
            while(j>p)
            {
                diff=nums[j]-nums[p];
                if(Math.abs(diff)<min_diff&&nums[j]>nums[p])
                {
                    index=j;
                    min_diff=diff;
                }
                j--;
            }
            swap(nums,index,p);
            reverse(nums,p);
        }
    }
    public void swap(int[] nums,int index,int p)
    {
        int t=nums[index];
        nums[index]=nums[p];
        nums[p]=t;
    }
    public void reverse(int[] nums,int p)
    {
        int j=nums.length-1,d=p+1;
        while(d<j)
        {
            swap(nums,d,j);
            j--;
            d++;
        }
    }
}