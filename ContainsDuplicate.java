class Solution {
    // Method to check if an array contains duplicate elements
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store unique numbers
        HashSet<Integer> numbers = new HashSet<>();

        // Iterate over each element in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current number already exists in the HashSet, it means it's a duplicate
            if (numbers.contains(nums[i])) {
                return true; // Return true as we found a duplicate
            }
            else {
                // If it's not a duplicate, add the current number to the HashSet
                numbers.add(nums[i]);
            }
        }
        // If no duplicates were found, return false
        return false;
    }
}


//-------------------------------------------------------

class Solution {
    // Method to check if an array contains duplicate elements
    public boolean containsDuplicate(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        // Iterate through the sorted array, checking adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            // If two adjacent elements are the same, it means a duplicate is found
            if (nums[i] == nums[i + 1]) {
                return true; // Return true as we found a duplicate
            }
        }
        // If no duplicates are found, return false
        return false;
    }
}
