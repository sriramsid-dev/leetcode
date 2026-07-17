class Solution {
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='O'&&(i==0||j==0||i==board.length-1||j==board[0].length-1))
                {
                    dfs(board,i,j);
                }
            }
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }
                if(board[i][j]=='s')
                {
                    board[i][j]='O';
                }
            }
        }
    }
    public void dfs(char[][] board,int i,int j)
    {
        if(i>=board.length||j>=board[0].length||i<0||j<0||board[i][j]!='O')
        {
            return;
        }
        board[i][j]='s';
        dfs(board,i+1,j);
        dfs(board,i,j+1);
        dfs(board,i-1,j);
        dfs(board,i,j-1);
    }
}