class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        solve(n,"",l);
        return l;
    }
    public void solve(int n,String s,List<String> l)
    {
        if(s.length()==2*n)
        {
            if(isvalid(s))
            {
                l.add(s);
            }
            return;
        }
        solve(n,s+"(",l);
        solve(n,s+")",l);
    }
    public boolean isvalid(String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                c++;
            }
            else
            {
                c--;
            }
            if(c<0)
            {
                return false;
            }
        }
        if(c==0)
        {
            return true;
        }
        return false;
    }
}