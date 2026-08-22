class Solution {
    public boolean checkDivisibility(int n) {
        int p=1,s=0,k=n;
        while(n>0)
        {
            int d=n%10;
            s+=d;
            p=p*d;
            n/=10;
        }
        if(k%(s+p)==0)return true;
        return false;
    }
}