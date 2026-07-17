class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)
        {
            return image;
        }
        solve(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public void solve(int[][] image,int sr,int sc,int color,int d)
    {
        if(sr>=image.length||sc>=image[0].length||sr<0||sc<0||image[sr][sc]!=d)
        {
            return;
        }
        image[sr][sc]=color;
        //if(sr-1>=0&&image[sr-1][sc]!=color)
        //{
            solve(image,sr-1,sc,color,d);
        //}
        //if(sc-1>=0&&image[sr][sc-1]!=color)
        //{
            solve(image,sr,sc-1,color,d);
        //}
        //if(sr+1<image.length&&image[sr+1][sc]!=color)
        //{
            solve(image,sr+1,sc,color,d);
        //}
        //if(sc+1<image.length&&image[sr][sc+1]!=color)
        //{
            solve(image,sr,sc+1,color,d);
        //}
    }
}