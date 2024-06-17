class Solution {
    public int romanToInt(String s) {
        // Create a mapping of Roman numerals to their integer values
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int result = 0;
        int n = s.length();
        
        // Iterate through the string from left to right
        for (int i = 0; i < n; i++) {
            int currentValue = romanValues.get(s.charAt(i));
            
            // If the current value is smaller than the next value, subtract it
            if (i < n - 1 && currentValue < romanValues.get(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                // Otherwise, add it to the result
                result += currentValue;
            }
        }
        
        return result;
    }
}
