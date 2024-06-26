class Solution:
    def maximumGap(self, nums: List[int]) -> int:
        if len(nums) < 2:
            return 0
        else:
            nums.sort()
            rs =[]
            for i in range(len(nums) - 1):
                rs.append(nums[i+1] - nums[i])
            return max(rs)
        

        