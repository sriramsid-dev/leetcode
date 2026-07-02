class Solution {
    public void reverseString(char[] s) {
        char[] rev=new char[s.length];
        int j=s.length-1;
        for(int i=0;i<s.length/2;i++)
        {
            char l=s[i];
            s[i]=s[j];
            s[j]=l;
            j--;
        }
    
    }
}