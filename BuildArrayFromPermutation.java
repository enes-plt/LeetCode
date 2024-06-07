class Solution {
    public int[] buildArray(int[] nums) {
        // Get the length of the input array
        int n = nums.length;
        
        // Initialize the result array with the same length as nums
        int[] result = new int[n];
        
        // Iterate over each index in the nums array
        for (int i = 0; i < n; i++) {
            // Set result[i] to the value at the index nums[i] in the nums array
            result[i] = nums[nums[i]];
        }
        
        // Return the constructed result array
        return result;
    }
}
