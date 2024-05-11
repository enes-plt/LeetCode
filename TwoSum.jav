/*class Solution {
    // Method to find the indices of two numbers in the array 
    // that add up to the target
    public int[] twoSum(int[] nums, int target) {
        // Iterate through each element of the array (first number)
        for (int i = 0; i < nums.length; i++){
            // Iterate through the remaining elements of the array (second number)
            for (int j = i + 1; j < nums.length; j++){
                // Check if the sum of the current pair of numbers equals the target
                if (nums[i] + nums[j] == target){
                    // If found, return the indices of the two numbers
                    return new int[]{i, j};
                }
            }
        }
        // If no two numbers add up to the target, return an array containing the input nums
        return nums;
    }
}*/


//The code above has big(O) time complexity of n^2 (quadratic time complexity).

//---------------------------------------------------------------------------//


import java.util.HashMap;
import java.util.Map;

class Solution {
    // Method to find the indices of two numbers in the array 
    // that add up to the target
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complements of elements 
        // encountered so far along with their indices
        Map<Integer, Integer> complements = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++){
            // Check if the complement of the current element exists in the HashMap
            Integer complementIndex = complements.get(nums[i]);
            
            // If the complement exists, return the indices of the two numbers
            // that add up to the target
            if (complementIndex != null){
                return new int[]{i, complementIndex};
            }
            
            // If the complement doesn't exist, store the current element's complement
            // along with its index in the HashMap
            complements.put(target - nums[i], i);
        }
        // If no two numbers add up to the target, return an array containing the input nums
        return nums;
    }
}

// The above code utilzed Hashmap, and it has constant time complexity.