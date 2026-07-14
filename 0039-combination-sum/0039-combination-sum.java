class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        solve(candidates,target,l1,0,0);
        return l;
    }
    public void solve(int[] c,int t,List<Integer> l1,int s,int i)
    {
        if(s==t)
        {
            l.add(new ArrayList<>(l1));
            return;
        }
        if(s>t||i>=c.length)
        {
            return;
        }
        l1.add(c[i]);
        solve(c,t,l1,s+c[i],i);
        l1.remove(l1.size()-1);
        solve(c,t,l1,s,i+1);
    }
}