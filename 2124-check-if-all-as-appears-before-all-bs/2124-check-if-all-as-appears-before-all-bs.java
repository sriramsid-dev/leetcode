class Solution {
    public boolean checkString(String s) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='b')
            {
                c=1;
            }
            else if(s.charAt(i)=='a'&&c==1)
            {
                return false;
            }
            else
            {
                continue;
            }
        }
        return true;
    }
}