class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int[] a=nums;
        List<List<Integer>> l1=new ArrayList<>();
        for(int k=0;k<n;k++)
        {
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            for(int start=k+1;start<n;start++)
            {
                if (start > k + 1 && nums[start] == nums[start - 1]) continue;
                long s1=a[start]+a[k];
                int i=start+1,j=nums.length-1;
                
                int f=0;
                while(i<j)
                {
                    if(a[i]+a[j]+s1==target)
                    {
                        List<Integer> l=new ArrayList<>();
                        l.add(a[i]);
                        l.add(a[j]);
                        l.add(a[start]);
                        l.add(a[k]);
                        l1.add(l);
                        int temp=a[i];
                        while(i<j&&temp==a[i])
                        {
                            i++;
                        }
                        int tempj=a[j];
                        while(i<j&&tempj==a[j])
                        {
                            j--;
                        }
                    }
                    else if(a[i]+a[j]+s1<target)
                    {
                        i++;
                    }
                    else
                    {
                        j--;
                    }
                }
            }
        }
        return l1;
    }
}