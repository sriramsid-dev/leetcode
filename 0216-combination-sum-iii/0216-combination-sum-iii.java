class Solution {
    List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> l1=new ArrayList<>();
        solve(k,n,1,l1,0);
        return l;
    }
    public void solve(int k,int n,int i,List<Integer> l1,int s)
    {
        if(i<0||s>n||i>9||l1.size()>=k)
        {
            if(s==n&&l1.size()==k)
            {
                l.add(new ArrayList<>(l1));
                return;
            }
            return;
        }
        if(s==n&&l1.size()==k)
        {
            l.add(new ArrayList<>(l1));
            return;
        }
        l1.add(i);
        solve(k,n,i+1,l1,s+i);
        l1.remove(l1.size()-1);
        solve(k,n,i+1,l1,s);
    }
}