class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> permute(int[] nums) {
        l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        solve(nums,0,l1);
        return l;
    }
    public void solve(int[] nums,int i,List<Integer> l1)
    {
        if(l1.size()==nums.length)
        {
            l.add(new ArrayList<>(l1));
            return;
        }
        if(i>=nums.length)
        {
            return;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(!l1.contains(nums[j]))
            {
                l1.add(nums[j]);
                solve(nums,i+1,l1);
                l1.remove(l1.get(l1.size()-1));
            }
        }
    }
}