class Solution(object):
    def maxVowels(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: int
        """
        vowel = set(['a', 'e', 'i', 'o', 'u'])    
        
        ret = 0
        cur = 0
        left = 0

        for i in range(k):
            if s[i] in vowel:
                cur += 1

        ret = cur

        for i in range(k, len(s)):
            if s[left] in vowel:
                cur -= 1
            if s[i] in vowel:
                cur += 1
            left += 1    
            
            ret = max(ret, cur)

        return ret


        

        