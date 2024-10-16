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


//-----------------------------------------

class Solution {
    public int removeElement(int[] nums, int val) {
        // Initialize boundary as the last index of the array
        int boundary = nums.length - 1;
        // Start iterating from the first element of the array
        int k = 0;
        
        // Loop until the current index 'k' is less than or equal to the boundary
        while (k <= boundary) {
            // If the current element is equal to 'val'
            if (nums[k] == val) {
                // Swap the element at 'k' with the element at the boundary
                swap(nums, k, boundary);
                // Decrease the boundary to exclude the swapped element
                boundary--;
            } else {
                // Move to the next element if it's not equal to 'val'
                k++;
            }
        }
        // Return the index 'k' which represents the new length of the array
        // after all instances of 'val' are removed
        return k;
    }

    // Method to swap two elements in the array
    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
}



//------------------------------------------

class Solution {
    public int removeElement(int[] nums, int val) {
        // Initialize two pointers
        int left = 0;  // Start from the beginning of the array
        int right = nums.length - 1;  // Start from the end of the array
        
        // Loop until the two pointers cross
        while (left <= right) {
            if (nums[left] == val) {
                // If the element at the left pointer is the target value,
                // replace it with the element at the right pointer
                nums[left] = nums[right];
                // Decrement the right pointer since we have handled that element
                right--;
            } else {
                // If the element at the left pointer is not the target value,
                // just move the left pointer to the next element
                left++;
            }
        }
        
        // Return the new length of the array which is the position of the left pointer
        return left;
    }
}