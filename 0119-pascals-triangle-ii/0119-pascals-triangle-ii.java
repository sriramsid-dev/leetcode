class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> dp=new ArrayList<>();
        dp.add(new ArrayList<>());
        dp.get(0).add(1);
        if(rowIndex==0)
        {
            return dp.get(0);
        }
        dp.add(new ArrayList<>());
        dp.get(1).add(1);
        dp.get(1).add(1);
        for(int i=1;i<rowIndex;i++)
        {
            List<Integer> l=new ArrayList<>();
            l.add(1);
            for(int j=0;j<dp.get(i).size()-1;j++)
            {
                l.add(dp.get(i).get(j)+dp.get(i).get(j+1));
            }
            l.add(1);
            dp.add(l);
        }
        return dp.get(rowIndex);
    }
}