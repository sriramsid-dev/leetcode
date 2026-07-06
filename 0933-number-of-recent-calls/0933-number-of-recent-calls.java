class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q=new ArrayDeque<>();
    }
    
    public int ping(int t) {
        q.offer(t);
        int l=t-3000,c=0;
        for(int i:q)
        {
            if(i>=l)
            {
                c++;
            }
        }
        return c;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */