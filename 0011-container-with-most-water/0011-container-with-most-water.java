class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,max=0,totmax=0;
        while(l<=r)
        {
            max=(Math.min(height[l],height[r]))*(r-l);
            if(max<0)
            {
                max=-max;
            }
            if(max>totmax)
            {
                totmax=max;
            }
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return totmax;
    }
}