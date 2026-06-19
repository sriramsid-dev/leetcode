class Solution {
    public int trap(int[] height) {
        int[] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];
        int[] min=new int[height.length];
        int lmax=0,rmax=0;
        for(int i=0;i<height.length;i++)
        {
            if(lmax<height[i])
            {
                lmax=height[i];
            }
            leftmax[i]=lmax;
        }
        for(int i=height.length-1;i>=0;i--)
        {
            if(rmax<height[i])
            {
                rmax=height[i];
            }
            rightmax[i]=rmax;
        }
        for(int i=0;i<height.length;i++)
        {
            min[i]=Math.min(leftmax[i],rightmax[i]);
            min[i]=min[i]-height[i];
        }
        int s=0;
        for(int i=0;i<height.length;i++)
        {
            if(min[i]>0)
            {
                s+=min[i];
            }
        }
        return s;
    }
}