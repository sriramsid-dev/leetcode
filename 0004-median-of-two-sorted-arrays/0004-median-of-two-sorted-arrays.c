double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
     int i,j;
    float output;
    nums1=(int*)realloc(nums1,(nums1Size+nums2Size)*sizeof(int));
    for(i=nums1Size,j=0;i<(nums1Size+nums2Size);i++)
    {
        nums1[i]=nums2[j];
        j++;
    }
    for(i=0;i<(nums1Size+nums2Size);i++)
    {
        for(int j=i+1;j<(nums1Size+nums2Size);j++)
        {
            if(nums1[i]>nums1[j])
            {
                int temp=nums1[i];
                nums1[i]=nums1[j];
                nums1[j]=temp;
            }
        }
    }
    int n=nums1Size+nums2Size;
    if((n)%2==0)
    {
        return ((float)nums1[(n/2)-1]+(float)nums1[n/2])/2.0;
    }
    else
    {
        return nums1[n/2];
    }
    

}
