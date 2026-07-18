class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones)
        {
            q.offer(i);
        }
        while(q.size()!=1)
        {
            int y=q.poll();
            int x=q.poll();
            if(x!=y)
            {
                q.offer(y-x);
            }
            if(q.size()==0)
            {
                return 0;
            }
        }
        return q.poll();
    }
}