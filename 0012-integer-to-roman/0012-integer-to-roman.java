class Solution {
    public String intToRoman(int num) {
        // Create mappings of Roman numeral symbols to their corresponding values
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        StringBuilder result = new StringBuilder();
        
        // Iterate through the symbols and their corresponding values
        for (int i = 0; i < symbols.length; i++) {
            // Append the symbol as many times as needed based on the value
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }
        
        return result.toString();
    }
}
