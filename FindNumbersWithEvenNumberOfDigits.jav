class Solution {
    // Method to find the number of elements in the array 
    // that have an even number of digits
    public int findNumbers(int[] nums) {
        // Initialize a counter to keep track of the count
        int count = 0;
        
        // Iterate through each element of the input array
        for (int i : nums){
            // Convert the integer to a string to get its length
            String s = String.valueOf(i);
            // Get the length of the string representation of the integer
            int len = s.length();
            
            // Check if the length of the string is even
            if (len % 2 == 0){
                // If the length is even, increment the count
                count++;
            }
        }
        // Return the total count of elements with even number of digits
        return count;
    }
}
