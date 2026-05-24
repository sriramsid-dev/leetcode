class Solution {
    public String simplifyPath(String path) {
        String[] parts=path.split("/");
        Stack<String> stack= new Stack<>();
        for(int i=0;i<parts.length;i++)
        {
            if(parts[i].equals("")||parts[i].equals("."))
            {
                continue;
            }
            else if(parts[i].equals(".."))
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else 
            {
                stack.push(parts[i]);
            }
        }
        StringBuffer sb=new StringBuffer();
        for(String i:stack){
            sb.append('/');
            sb.append(i);
        }
        if(sb.length()==0)
        {
            return "/";
        }
        return sb.toString();
    }
}