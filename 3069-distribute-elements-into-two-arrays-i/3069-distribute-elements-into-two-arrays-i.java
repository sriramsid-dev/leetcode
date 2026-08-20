class Solution {
    public int[] resultArray(int[] nums) {
        int[] a1=new int[nums.length];
        int[] a2=new int[nums.length];
        int[] r=new int[nums.length];
        a1[0]=nums[0];
        a2[0]=nums[1];
        int i=0,j=0;
        for(int k=2;k<nums.length;k++)
        {
            if(a1[i]>a2[j])
            {
                a1[++i]=nums[k];
            }
            else
            {
                a2[++j]=nums[k];
            }
        }
        int d = 0;

        for (int p = 0; p <= i; p++) {
            r[d++] = a1[p];
        }

        for (int p = 0; p <= j; p++) {
            r[d++] = a2[p];
        }
        return r;
    }
}