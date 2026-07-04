class Solution {
    public int maxVowels(String s, int k) {
        int l=0,r=k,c=0,maxcount=0;
        while(l<r)
        {
            if(s.charAt(l)=='a'||s.charAt(l)=='e'||s.charAt(l)=='i'||s.charAt(l)=='o'||s.charAt(l)=='u')
            {
                c++;
            }
            l++;
        }
        if(maxcount<c)
        {
            maxcount=c;
        }
        l=0;
        while(r<s.length())
        {
            if(s.charAt(l)=='a'||s.charAt(l)=='e'||s.charAt(l)=='i'||s.charAt(l)=='o'||s.charAt(l)=='u')
            {
                c=c-1;
            }
            if((s.charAt(r)=='a'||s.charAt(r)=='e'||s.charAt(r)=='i'||s.charAt(r)=='o'||s.charAt(r)=='u'))
            {
                c++;
            }
            if(maxcount<c)
            {
                maxcount=c;
            }
            r++;
            l++;
        }
        return maxcount;
    }
}