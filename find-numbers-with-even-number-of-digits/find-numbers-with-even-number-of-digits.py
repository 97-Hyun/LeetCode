class Solution(object):
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ret = 0
        
        for i in range(len(nums)):
            cnt = 0
            
            for j in range(len(str(nums[i]))):
                cnt += 1
                
            if cnt % 2 == 0:
                ret += 1
                
        return ret
        