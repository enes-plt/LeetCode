class Solution {
    public int[] replaceElements(int[] arr) {
        // Initialize rightMax to -1. This variable will keep track of the maximum value
        // We start with -1 because there is no element to the right of the last element.
        int rightMax = -1;

        // Loop through the array from the last element to the first.
        // We use a reverse for loop to ensure we are replacing each element with the
        // greatest element to its right.
        for (int i = arr.length - 1; i >= 0; i--) {

            // Store the current maximum value in a temporary variable `newMax`.
            // `newMax` is the maximum of rightMax and the current element `arr[i]`.
            //This is needed because after we replace the current
            // element with rightMax, we will update rightMax to be the new maximum.
            int newMax = Math.max(rightMax, arr[i]);
            
            // Replace the current element in the array with rightMax.
            // At this point, rightMax contains the maximum value of the elements to the right of `arr[i]`.
            // This is the value we are supposed to assign to `arr[i]`.
            arr[i] = rightMax;

            // Update rightMax to be the maximum value between the current element (`arr[i]`)
            // before it was replaced, and the old value of rightMax. This ensures that in the next
            // iteration, rightMax reflects the largest value seen to the right of the next element.
            rightMax = newMax;
        }

        // Return the array where each element has been replaced by the greatest element to its right.
        return arr;
    }
}

//-----------------------------------------------------

class Solution {
    public int[] replaceElements(int[] arr) {
        // Initialize maxSoFar to the last element of the array.
        // This variable will track the maximum element to the right of the current element as we move from right to left.
        int maxSoFar = arr[arr.length - 1];
        
        // Set the last element to -1 because, by definition, the last element has no elements to its right.
        arr[arr.length - 1] = -1;
        
        // Iterate through the array starting from the second-last element down to the first element.
        for(int i = arr.length - 2; i >= 0; i--) {
            // Store the current value of arr[i] in currVal because we are going to replace arr[i] with maxSoFar,
            // but we still need the original value of arr[i] to update maxSoFar.
            int currVal = arr[i];
            
            // Replace arr[i] with maxSoFar, which is the maximum element we've encountered to the right of arr[i].
            arr[i] = maxSoFar;
            
            // Update maxSoFar to be the maximum between the current maxSoFar and the original value of arr[i] (currVal).
            // This ensures that maxSoFar always holds the largest element seen so far as we move left.
            maxSoFar = Math.max(maxSoFar, currVal);
        }
        
        // Return the array where each element has been replaced by the greatest element to its right.
        return arr;
    }
}

