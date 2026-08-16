class Solution {
    public int nextGreaterElement(int n) {
        if(n>=2147483486)return -1;
        String s1=""+n;
        int[] s=new int[s1.length()];
        for(int i=0;i<s1.length();i++)
        {
            s[i]=Integer.parseInt(""+s1.charAt(i));
        }
        int j=s.length-1,p=-1;
        while(j>0)
        {
            if(s[j]>s[j-1])
            {
                p=j-1;
                break;
            }
            j--;
        }
        if(p==-1)
        {
            return p;
        }
        else
        {
            int diff=0,min_diff=Integer.MAX_VALUE,index=0;
            for(int i=s.length-1;i>p;i--)
            {
                diff=s[i]-s[p];
                if(Math.abs(diff)<min_diff&&s[i]>s[p])
                {
                    index=i;
                    min_diff=diff;
                }
            }
            swap(s,index,p);
            reverse(s,p);
            long sum=0;
            for(int i=0;i<s.length;i++)
            {
                sum=sum*10+s[i];
                if (sum > Integer.MAX_VALUE) {
                return -1;
            }
            }
            return (int)sum;
        }
    }
    public void swap(int[] nums,int i,int j)
    {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public void reverse(int[] n,int p)
    {
        int j=n.length-1,d=p+1;
        while(d<j)
        {
            swap(n,j,d);
            j--;
            d++;
        }
    }
}