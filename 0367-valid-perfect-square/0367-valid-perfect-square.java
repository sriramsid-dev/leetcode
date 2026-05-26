class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)return true;
        int low=0,high=num-1;
        long r=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            long s=(long)mid*mid;
            if(s==num)
            {
                return true;
            }
            else if(s<num)
            {

                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return false;
    }
}