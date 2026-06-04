class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0,high=arr.length-1,k=arr[arr.length-1],index=arr.length-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==arr[mid+1])
            {
                index=mid;
                break;
            }
            if(arr[mid]>arr[mid+1])
            {
                index=mid;
                high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return index;
    }
}