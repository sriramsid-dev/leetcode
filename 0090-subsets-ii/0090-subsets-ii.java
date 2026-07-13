class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        solve(nums,0,l1);
        return l;
    }
    public void solve(int[] nums,int i,List<Integer> l1)
    {
        if(i>=nums.length)
        {
           l.add(new ArrayList<>(l1));
            return;
        }
        l1.add(nums[i]);
        solve(nums,i+1,l1);
        l1.remove(l1.size()-1);
        while(i+1<nums.length&&nums[i]==nums[i+1])i++;
        solve(nums,i+1,l1);
    }
}