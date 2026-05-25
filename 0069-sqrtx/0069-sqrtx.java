class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;
        if(x==1)return 1;
        int low=0,high=x-1;
        long r=1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            long sq=(long)mid*mid;
            if(sq==x)
            {
                return mid;
            }
            else if(sq<x)
            {
                r=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return (int)r;
    }
}