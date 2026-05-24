class Solution(object):
    def mostWordsFound(self, sentences):
        """
        :type sentences: List[str]
        :rtype: int
        """
        m=0
        for s in sentences:
            a=s.split(" ")
            if(len(a)>m):
                m=len(a)
        return m