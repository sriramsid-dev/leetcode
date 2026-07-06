class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] a=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int i=1;i<temperatures.length;i++)
        {
            if(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()])
            {
                while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()])
                {
                    a[stack.peek()]=i-stack.pop();
                }
            }
            stack.push(i);
        }
        return a;
    }
}