class Solution {
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


//------------------------------------------------

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length; // Get the length of the input array

        // Use a nested loop to compare each element with every other element
        for (int i = 0; i < n - 1; i++) { // Outer loop goes from the first element to the second-last
            for (int j = i + 1; j < n; j++) { // Inner loop goes from the element next to 'i' to the last
                if (nums[i] == nums[j]) { // Check if any two elements are equal
                    return true; // If a duplicate is found, return true
                }
            }
        }

        // If no duplicates are found after checking all pairs, return false
        return false;
    }
}
