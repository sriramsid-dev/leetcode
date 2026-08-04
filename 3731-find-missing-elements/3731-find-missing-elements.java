class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            if(min>nums[i])
            {
                min=nums[i];
            }
            if(max<nums[i])
            {
                max=nums[i];
            }
        }
        for(int i=min;i<=max;i++)
        {
            if(h.get(i)==null)
            {
                l.add(i);
            }
        }
        return l;
    }
}