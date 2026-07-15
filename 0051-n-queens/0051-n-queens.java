class Solution {
    List<List<String>> l;
    public List<List<String>> solveNQueens(int n) {
        l=new ArrayList<>();
        List<String> l1=new ArrayList<>();
        char[][] board=new char[n][n];
        for(char[] r:board)
        {
            Arrays.fill(r,'.');
        }
        solve(n,0,board,l1);
        return l;
    }
    public void solve(int n,int row,char[][] board,List<String> l1)
    {
        if(row==n)
        {
            l1=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                l1.add(new String(board[i]));
            }
            l.add(new ArrayList<>(l1));
            return;
        }
        for(int column=0;column<n;column++)
        {
            if(isSafe(row,column,board))
            {
                board[row][column]='Q';
                solve(n,row+1,board,l1);
                board[row][column]='.';
            }
        }
    }
    public boolean isSafe(int row,int col,char[][] board)
    {
        int r=row;
        int c=col;
        //vertical check
        while(r>=0)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
            r--;
        }
        //left diagonal
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
        //right diagnol
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