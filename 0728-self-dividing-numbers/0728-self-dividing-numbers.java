class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            boolean f=true;
            int p=i;
            while(p>0)
            {
                int d=p%10;
                if(d==0||(i%d!=0))
                {
                    f=false;
                    break;
                }
                p=p/10;
            }
            if(f==true)
            {
                l.add(i);
            }
        }
        return l;
    }
}