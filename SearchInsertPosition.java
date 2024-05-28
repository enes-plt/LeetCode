class Solution {
    // Method to find the index where the target should be inserted in a sorted array
    public int searchInsert(int[] nums, int target) {
        // Initialize the left and right pointers
        int left = 0;
        int right = nums.length - 1;
        
        // Continue searching while the left pointer is less than or equal to the right pointer
        while(left <= right){
            // Calculate the middle-point index
            int middle = (left + right) / 2;
            
            // Check if the middle element is the target
            if(nums[middle] == target){
                return middle; // Target found, return the index
            }
            // If the target is less than the middle element, adjust the right pointer
            else if(nums[middle] > target){
                right = middle - 1;
            }
            // If the target is greater than the middle element, adjust the left pointer
            else{
                left = middle + 1;
            }
        }
        
        // If target is not found, return the position where it should be inserted
        return left;
    }
}
