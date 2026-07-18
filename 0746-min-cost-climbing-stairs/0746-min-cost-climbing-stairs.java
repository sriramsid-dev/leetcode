class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return (int)Math.min(solve(cost,0),solve(cost,1));

    }
    public int solve(int[] cost,int i)
    {
        if(i>=cost.length)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int onestep=cost[i]+solve(cost,i+1);
        int twostep=cost[i]+solve(cost,i+2);
        dp[i]=Math.min(onestep,twostep);
        return dp[i];
    }
}