class Solution {
    public String digitSum(String s, int k) {
        String ans = "";
        while (s.length() > k) {
            ans = "";
            int i = 0, j = k;
            while (j < s.length()) {
                ans = ans + sumStr(s.substring(i, j));
                i = j;
                j = j + k;
            }
            ans = ans + sumStr(s.substring(i, s.length()));
            s = ans;
        }
        return s;
    }

    int sumStr(String part) {
        int total = 0;
        for (int idx = 0; idx < part.length(); idx++) {
            total += part.charAt(idx) - '0';
        }
        return total;
    }
}