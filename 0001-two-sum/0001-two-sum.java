class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the numbers and their indices
        Map<Integer, Integer> numMap = new HashMap<>();
        
        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            // Check if the complement exists in the HashMap
            if (numMap.containsKey(complement)) {
                // If it exists, return the indices of the complement and the current number
                return new int[] { numMap.get(complement), i };
            }
            
            // If it doesn't exist, add the current number and its index to the HashMap
            numMap.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array (or throw an exception)
        throw new IllegalArgumentException("No two sum solution");
    }
}