class Solution(object):
    def numOfStrings(self, patterns, word):
        """
        :type patterns: List[str]
        :type word: str
        :rtype: int
        """
        c=0
        for s in patterns:
            if s in word:
                c+=1
        return c
        