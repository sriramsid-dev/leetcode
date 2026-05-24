class Solution {
    public int maxDistinct(String s) {
        int[] f=new int[256];
        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i)]++;
        }
        int c=0;
        for(int i=0;i<256;i++)
        {
            if(f[i]>=1)
            {
                c++;
            }
        }
        return c;
    }
}