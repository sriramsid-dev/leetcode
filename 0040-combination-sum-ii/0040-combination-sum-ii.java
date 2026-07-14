class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        solve(candidates,target,l1,0,0);
        return l;
    }
    public void solve(int[] c,int t,List<Integer> l1,int s, int i)
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
        solve(c,t,l1,s+c[i],i+1);
        l1.remove(l1.size()-1);
        while(i<c.length-1&&c[i]==c[i+1])i++;
        solve(c,t,l1,s,i+1);
    }
}