class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> l1=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] a=strs[i].toCharArray();
            Arrays.sort(a);
            if(map.containsKey(new String(a)))
            {
                map.get(new String(a)).add(strs[i]);
            }
            else
            {
                List<String> l=new ArrayList<>();
                l.add(strs[i]);
                map.put(new String(a),l);
            }
        }
        for(String s:map.keySet())
        {
            l1.add(map.get(s));
        }
        return l1;
    }
}