class Solution {
    public void setZeroes(int[][] matrix) {
        int index=-1;
        List<Integer> r=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for(int i=0;i<r.size();i++)
        {
            for(int j=0;j<matrix[r.get(i)].length;j++)
            {
                matrix[r.get(i)][j]=0;
            }
            int k=c.get(i);
            for(int row=0;row<matrix.length;row++)
            {
                matrix[row][k]=0;
            }
        }
    }
}