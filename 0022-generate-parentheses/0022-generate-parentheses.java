class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        solve(n,"",l,0,0);
        return l;
    }
    public void solve(int n,String s,List<String> l,int open,int close)
    {
        if(s.length()==2*n)
        {
            l.add(s);
            return;
        }
        if(open<n)
        {
            solve(n,s+"(",l,open+1,close);
        }
        if(close<open)
        {
            solve(n,s+")",l,open,close+1);
        }
    }
}