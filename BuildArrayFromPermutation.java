class Solution {
    public int[] buildArray(int[] nums) {
        // Get the length of the input array
        int n = nums.length;
        
        // Initialize the ans array with the same length as nums
        int[] ans = new int[n];
        
        // Iterate over each index in the nums array
        for (int i = 0; i < n; i++) {
            // Set ans[i] to the value at the index nums[i] in the nums array
            ans[i] = nums[nums[i]];
        }
        
        // Return the constructed ans array
        return ans;
    }
}
