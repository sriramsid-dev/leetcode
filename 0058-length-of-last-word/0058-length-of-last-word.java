class Solution {
    public int lengthOfLastWord(String s) {
        int f=0,c=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' '&&f==1)
            {
                break;
            }
            if(s.charAt(i)==' ')
            {
                continue;
            }
            if(s.charAt(i)!=' ')
            {
                f=1;
                c++;
            }
        }
        return c;
    }
}