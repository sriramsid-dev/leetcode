class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        HashSet<Character> set=new HashSet<>();
        set.add(s.charAt(0));
        int max=0,c=0,l=0,r=1;
        while(r<s.length())
        {
            if(set.contains(s.charAt(r)))
            {
                while(s.charAt(l)!=s.charAt(r))
                {
                    set.remove(s.charAt(l));
                    l++;
                }
                l++;
            }
            else
            {
                set.add(s.charAt(r));
                c=r-l+1;
                if(c>max)
                {
                    max=c;
                }
            }
            r++;
        }
        if(max==0&&s.length()!=0)
        {
            return 1;
        }
        return max;
    }
}