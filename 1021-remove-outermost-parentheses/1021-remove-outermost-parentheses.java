class Solution {
    public String removeOuterParentheses(String s) {
        //Stack<Character> stack=new Stack<>();
    //     stack.push(s.charAt(0));
    //     for(int i=1;i<s.length();i++)
    //     {
    //         if(stack.peek()==s.charAt(i))
    //         {
    //             stack.pop();
    //             stack.push(s.charAt(i));
    //         }
    //         else
    //         {
    //             stack.push(s.charAt(i));
    //         }
    //     }
    //     String k="";
    //     for(char c:stack)
    //     {
    //         k=k+c;
    //     }
    //     return k;
    // }
    String k="";
    int c=0;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='(')
        {
            if(c>0)
            {
                k=k+s.charAt(i);
            }
            c++;
        }
        else
        {
            c--;
            if(c>0)k=k+s.charAt(i);
        }
    }
        return k;
    }
}