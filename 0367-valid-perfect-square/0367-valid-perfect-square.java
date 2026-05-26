class Solution {
    public boolean isPerfectSquare(int num) {
        int p=(int)Math.sqrt(num);
        if(p*p==num)return true;
        return false;
    }
}