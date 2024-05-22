class Solution {
    public int removeDuplicates(int[] nums) {
        // Initialize the index for the next distinct element
        int startIndex = 1;
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Compare the current element with the previous distinct element
            if (nums[i] != nums[startIndex - 1]) {
                // If the current element is different from the previous distinct element,
                // copy it to the position indicated by startIndex and increment startIndex
                nums[startIndex++] = nums[i];
            }
        }
        
        // Return the length of the modified array with unique elements
        return startIndex;
    }
}

//-------------------------------------------------------------

class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: if the input array is empty, return 0 since there are no elements to process
        if (nums.length == 0) {
            return 0;
        }

        // Initialize startIndex to 1 because the first element is always unique
        int startIndex = 1;

        // Loop through the array starting from the second element (index 1)
        for (int endIndex = 1; endIndex < nums.length; endIndex++) {
            // If the current element is different from the previous element,
            // it means we have found a new unique element
            if (nums[endIndex] != nums[endIndex - 1]) {
                // Assign this unique element to the position indicated by startIndex
                nums[startIndex] = nums[endIndex];
                // Increment startIndex to move to the next position for unique elements
                startIndex++;
            }
        }

        // Return the number of unique elements, which is the value of startIndex
        return startIndex;
    }
}


//---------------------------------------------------------------

class Solution {
    public int removeDuplicates(int[] nums) {
        // Initialize two pointers: startIndex for placing unique elements,
        // and endIndex for traversing the array
        int startIndex = 0;
        int endIndex = 0;
        
        // Traverse the array until endIndex reaches the end of the array
        while (endIndex < nums.length) {
            // Store the current value at endIndex
            int currentValue = nums[endIndex];
            
            // Increment endIndex while the next element is the same as the currentValue
            while (endIndex < nums.length && nums[endIndex] == currentValue) {
                endIndex++;
            }
            
            // Place the unique currentValue at the startIndex position
            nums[startIndex++] = currentValue;
        }
        
        // Return the number of unique elements, which is the value of startIndex
        return startIndex;
    }
}