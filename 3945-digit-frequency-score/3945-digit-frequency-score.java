class Solution {
    public int digitFrequencyScore(int n) {
        String s=""+n;
        int[] f=new int[10];
        for(int i=0;i<s.length();i++)
        {
            int a=Integer.parseInt(""+s.charAt(i));
            f[a]++;
        }
        int su=0;
        for(int i=0;i<10;i++)
        {
            su=su+f[i]*i;
        }
        return su;
    }
}