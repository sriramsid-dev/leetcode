class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> combinationSum3(int k, int n) {
        l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        solve(k,n,0,1,l1);
        return l;
    }
    public void solve(int k,int n,int s,int i,List<Integer> l1)
    {
        if(s==n&&l1.size()==k)
        {
            l.add(new ArrayList<>(l1));
            return;
        }
        if(l1.size()>k||i>9)
        {
            return;
        }
        l1.add(i);
        solve(k,n,s+i,i+1,l1);
        l1.remove(l1.size()-1);
        solve(k,n,s,i+1,l1);
    }
}