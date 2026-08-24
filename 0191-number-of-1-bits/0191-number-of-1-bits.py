class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        s=bin(n)
        s=s[2:]
        c=0
        for i in s:
            if i=='1':
                c+=1
        return c
        