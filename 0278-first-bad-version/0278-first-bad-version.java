/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1,high=n,p=0;
        boolean f=true;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            f=isBadVersion(mid);
            if(f==true)
            {
                p=mid;
                high=mid-1;
            }
            if(f==false)
            {
                low=mid+1;
            }
        }
        return p;
    }
}