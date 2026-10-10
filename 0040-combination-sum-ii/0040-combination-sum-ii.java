class Solution {
    List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> l1=new ArrayList<>();
        solve(candidates,target,0,0,l1);
        return l;
    }
    public void solve(int[] nums,int t,int i,int s,List<Integer> l1)
    {
        if(s>t||i>=nums.length)
        {
            if(s==t)
            {
                l.add(new ArrayList<>(l1));
            }
            return;
        }
        if(s==t)
        {
            l.add(new ArrayList<>(l1));
            return;
        }
        l1.add(nums[i]);
        solve(nums,t,i+1,s+nums[i],l1);
        l1.remove(l1.get(l1.size()-1));
        while(i<nums.length-1&&nums[i]==nums[i+1])i++;
        solve(nums,t,i+1,s,l1);
    }
}