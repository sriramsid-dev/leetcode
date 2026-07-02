class Solution {
    int[][] dp;
    public int longestPalindromeSubseq(String s) {
        dp=new int[1000][1000];
        for(int[] r:dp)
        {
            Arrays.fill(r,-1);
        }
        String s2="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s2+=s.charAt(i);
        }
        return check(s,s2,0,0);
    }
    public int check(String s,String s2,int i,int j)
    {
        if(i==s.length()||j==s2.length())
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s.charAt(i)==s2.charAt(j))
        {
            dp[i][j]=1+check(s,s2,i+1,j+1);
        }
        else
        {
            dp[i][j]=Math.max(check(s,s2,i+1,j),check(s,s2,i,j+1));
        }
        return dp[i][j];
    }
}