class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        l = self.search(nums, target)
        r = self.search(nums, target+1)
        if l == r:
            return [-1, -1]
        else:
            return [l, r-1]
    def search(self, nums: List[int], x: int) -> int:
        left =0
        right = len(nums)
        while left < right:
            mid = (left + right) // 2
            if (nums[mid] >= x):
                right = mid
            else:
                left = mid + 1

        return left


        
        