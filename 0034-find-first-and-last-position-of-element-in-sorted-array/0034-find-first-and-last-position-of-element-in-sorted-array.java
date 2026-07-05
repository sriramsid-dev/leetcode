class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a=new int[2];
        if(nums.length==1)
        {
            if(nums[0]==target)
            {
                return a;
            }
            else
            {
                Arrays.fill(a,-1);
                return a;
            }
        }
        Arrays.fill(a,-1);
        int l=0,h=nums.length-1,d=0,c=0;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(nums[mid]==target)
            {
                d=mid;
                c++;
                a[0]=mid;
                h=mid-1;
            }
            else if(nums[mid]>target)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        l=0;h=nums.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(nums[mid]==target&&mid!=d)
            {
                c++;
                a[1]=mid;
                l=mid+1;
            }
            else if(nums[mid]>target)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        if(c==1)
        {
            Arrays.fill(a,d);
        }
        Arrays.sort(a);
        return a;
    }
}