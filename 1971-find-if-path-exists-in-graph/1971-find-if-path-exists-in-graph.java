class Solution {
    List<List<Integer>> neighbours;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        neighbours=new ArrayList<>();
        construct(edges,n);
        List<Integer> l=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int[] visited=new int[neighbours.size()];
        q.offer(source);
        while(!q.isEmpty())
        {
            int t=q.poll();
            if(visited[t]!=1)
            {
                l.add(t);
                visited[t]=1;
                for(int p:neighbours.get(t))
                {
                    if(visited[p]!=1)
                    {
                        q.offer(p);
                    }
                }
            }
        }
        if(l.contains(destination))
        {
            return true;
        }
        return false;
    }
    public void construct(int[][] edges,int n)
    {
        for(int i=0;i<n;i++)
        {
            neighbours.add(new ArrayList<>());
        }
        for(int[] e:edges)
        {
            int v1=e[0];
            int v2=e[1];
            neighbours.get(v1).add(v2);
            neighbours.get(v2).add(v1);
        }
    }
}