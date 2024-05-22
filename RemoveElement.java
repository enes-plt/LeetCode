class Solution {
    public int removeElement(int[] nums, int val) {
        // Initialize the pointer for the new array size
        int newArrayIndex = 0;

        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to the given value `val`
            if (nums[i] != val) {
                // Move the non-val element to the position `newArrayIndex`
                nums[newArrayIndex] = nums[i];
                // Increment the pointer for the new array size
                newArrayIndex++;
            }
        }

        // Return the number of elements that are not equal to `val`
        return newArrayIndex;
    }
}
