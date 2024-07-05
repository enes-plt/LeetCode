class Solution {
    public int minimumOperations(int[] nums) {
        // Initialize a counter to keep track of the number of elements not divisible by 3
        int count = 0;
        
        // Iterate through the array using a regular for loop
        for (int i = 0; i < nums.length; i++) {
            // Check if the current element is not divisible by 3
            if (nums[i] % 3 != 0) {
                // Increment the counter if the element is not divisible by 3
                count++;
            }
        }
        
        // Return the total count of elements not divisible by 3
        return count;
    }
}



//----------------------------------------------------------


class Solution {
    public int minimumOperations(int[] nums) {
        // Initialize a counter to keep track of the number of elements not divisible by 3
        int count = 0;
        // Initialize an index to traverse the array
        int i = 0;
        
        // Use a while loop to iterate through the array
        while (i < nums.length) {
            // Check if the current element is not divisible by 3
            if (nums[i] % 3 != 0) {
                // Increment the counter if the element is not divisible by 3
                count++;
            }
            // Move to the next element
            i++;
        }
        
        // Return the total count of elements not divisible by 3
        return count;
    }
}

