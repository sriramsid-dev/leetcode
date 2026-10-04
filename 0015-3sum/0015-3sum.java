class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        for(int start=0;start<nums.length;start++)
        {
            int i=start+1,j=nums.length-1,f=0;
            if (start > 0 && nums[start] == nums[start - 1]) continue;
            while(i<j)
            {
                List<Integer> l1=new ArrayList<>();
                int s=nums[i]+nums[j];
                if(s+nums[start]==0)
                {
                    l1.add(nums[start]);
                    l1.add(nums[i]);
                    l1.add(nums[j]);
                    f=1;
                    l.add(l1);
                    // After adding the triplet to 'l':
                    while (i < j && nums[i] == nums[i + 1]) i++; // Skip duplicate numbers for i
                    while (i < j && nums[j] == nums[j - 1]) j--; // Skip duplicate numbers for j
                    i++;
                    j--;
                    
                }
                else if(nums[start]+s<0)
                {
                    i++;
                }
                else
                {
                    j--;
                }
            }
            // if(f==1&&!l.contains(l1))
            // {
            //     l.add(l1);
            // }
        }
        return l;
    }
}