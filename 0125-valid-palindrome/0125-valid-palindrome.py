class Solution:
    def isPalindrome(self, s: str) -> bool:
        rs = ""
        for i in s:
            if i.isalpha() or i.isdigit():
                rs += i
        return rs.lower() == rs.lower()[::-1]


        