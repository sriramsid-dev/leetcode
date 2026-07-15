class Solution {
    int count=0;
    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        solve(n,0,board);
        return count;
    }
    public void solve(int n,int row,char[][] board)
    {
        if(row==n)
        {
            List<String> l=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                l.add(new String(board[i]));
            }
            count++;
            return;
        }
        for(int c=0;c<n;c++)
        {
            if(isSafe(row,c,board)){
            board[row][c]='Q';
            solve(n,row+1,board);
            board[row][c]='.';
            }
        }
    }
    public boolean isSafe(int row,int col,char[][] board)
    {
        int r=row;
        int c=col;
        while(r>=0)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
            r--;
        }
        r=row;c=col;
        while(r>=0&&c>=0)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
            r--;
            c--;
        }
        r=row;c=col;
        while(r>=0&&c>=0)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
            r--;
            c--;
        }
        r=row;c=col;
        while(r>=0&&c<board.length)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}