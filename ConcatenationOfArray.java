class Solution {
    public int[] getConcatenation(int[] nums) {
        // Get the length of the input array
        int n = nums.length;
        
        // Create a new array of size 2 * n to hold the concatenated result
        int[] ans = new int[n * 2];
        
        // Loop through each element of the input array
        for (int i = 0; i < n; i++) {
            // Assign the current element to the corresponding position in the first half of the result array
            ans[i] = nums[i];
            // Assign the current element to the corresponding position in the second half of the result array
            ans[i + n] = nums[i];
        }
        
        // Return the concatenated result array
        return ans;
    }
}
