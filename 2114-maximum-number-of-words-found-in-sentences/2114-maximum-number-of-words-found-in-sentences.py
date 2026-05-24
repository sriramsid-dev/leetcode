class Solution(object):
    def mostWordsFound(self, sentences):
        """
        :type sentences: List[str]
        :rtype: int
        """
        max=0
        for s in sentences:
            c=0
            for p in s:
                if p==' ':
                    c+=1
            if(c>max):
                max=c
        return max+1