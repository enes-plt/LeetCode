class Solution {
    // Method to find the maximum number of consecutive ones
    public int findMaxConsecutiveOnes(int[] nums) {
        // Initialize variables to store the maximum count of consecutive ones 
        // and the current count of consecutive ones
        int max = 0;
        int currentNumberOfOnes = 0;
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++){
            // Check if the current element is 1
            if (nums[i] == 1){
                // Increment the count of consecutive ones
                currentNumberOfOnes++;
                // Update the maximum count of consecutive ones
                max = Math.max(max, currentNumberOfOnes);
            }
            else {
                // If the current element is not 1, reset the count of consecutive ones
                currentNumberOfOnes = 0;
            }
        }
        // Return the maximum count of consecutive ones
        return max;
    }
}
