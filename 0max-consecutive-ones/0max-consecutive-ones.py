class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        cnt = 0
        max = 0
        
        for i in range(len(nums)):
            if nums[i] == 1:
                cnt += 1
            
                if cnt > max:
                    max = cnt 
            else:
                cnt = 0
        
        return max