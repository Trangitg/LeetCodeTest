class Solution:
    def climbStairs(self, n: int) -> int:
        a = 0
        b = 1
        for i in range(0, n):
            c = a + b
            a = b
            b = c

        return b
        