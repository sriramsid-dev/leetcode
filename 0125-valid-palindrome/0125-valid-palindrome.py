import re
class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        a=re.sub(r'[^a-zA-Z0-9]','',s).lower()
        b=a[::-1]
        if a==b:
            return True
        return False 