class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] a=new int[queries.length];
        int[] p=new int[nums.length];
        Arrays.sort(nums);
        p[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            p[i]=p[i-1]+nums[i];
        }
        for(int i=0;i<queries.length;i++)
        {
            int target=queries[i];
            int low=0,high=p.length;
            while(low<high)
            {
                int mid=low+(high-low)/2;
                if(p[mid]<=target)
                {
                    low=mid+1;
                }
                else
                {
                    high=mid;
                }
            }
            a[i]=low;   
        }
        return a;
    }
}