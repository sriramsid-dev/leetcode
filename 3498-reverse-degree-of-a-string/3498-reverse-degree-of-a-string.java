class Solution {
    public int reverseDegree(String s) {
        int p=0;
        for(int i=0;i<s.length();i++)
        {
            p=p+((('a'-s.charAt(i))+26)*(i+1));
        }
        return p;
    }
}