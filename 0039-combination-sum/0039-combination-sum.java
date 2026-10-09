class Solution {
    List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> l1=new ArrayList<>();
        solve(nums,0,0,l1,target);
        return l;
    }
    public void solve(int[] nums,int i,int s,List<Integer> l1,int target)
    {
        if(s==target)
        {
            l.add(new ArrayList<>(l1));
            return;
        }
        if(s>target)
        {
            return;
        }
        if(i>=nums.length)
        {
            if(s==target)
            {
                l.add(new ArrayList<>(l1));
            }
            return;
        }
        l1.add(nums[i]);
        solve(nums,i,s+nums[i],l1,target);
        l1.remove(l1.size()-1);
        solve(nums,i+1,s,l1,target);
    }
}