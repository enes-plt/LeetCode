class Solution {
    public int[] sortedSquares(int[] nums) {
        // Create an array to store the squared values
        int[] result = new int[nums.length];
        
        // Square each element in the input array
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        
        // Initialize two pointers: head (pointing to the start of the array) 
        // and tail (pointing to the end of the array)
        int head = 0;
        int tail = nums.length-1;
        
        // Iterate over the result array in reverse order
        for (int pos = nums.length-1; pos >=0; pos--){
            // Compare the squared values at head and tail pointers
            if(nums[head] > nums[tail]){
                // If the squared value at head is greater, 
                // insert it into the result array at the current position
                result[pos] = nums[head];
                // Move the head pointer to the right
                head++;
            }
            else{
                // If the squared value at tail is greater or equal, 
                // insert it into the result array at the current position
                result[pos] = nums[tail];
                // Move the tail pointer to the left
                tail--;
            }
        }
        // Return the sorted array of squared values
        return result;
    }
}
