class Solution {
    public int numEnclaves(int[][] grid) {
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(i==0||i==grid.length-1||j==0||j==grid[0].length-1||grid[i][j]!=1)
                {
                    solve(grid,i,j);
                }
            }
        }
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    c++;
                }
            }
        }
        return c;
    }
    public void solve(int[][] grid,int i,int j)
    {
        if(i>=grid.length||j>=grid[0].length||i<0||j<0||grid[i][j]==0)
        {
            return;
        }
        grid[i][j]=0;
        solve(grid,i+1,j);
        solve(grid,i,j+1);
        solve(grid,i-1,j);
        solve(grid,i,j-1);
    }
}