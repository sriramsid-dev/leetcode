class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> subsets(int[] nums) {
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
        solve(nums,i+1,l1);
    }
}