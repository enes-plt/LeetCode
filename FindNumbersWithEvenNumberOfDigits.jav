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


//-----------------------------------------------------

class Solution {
    public int findNumbers(int[] nums) {
        // Initialize a counter variable to count the number of integers with an even number of digits
        int count = 0;
        
        // Iterate through each integer in the array
        for (int num : nums) {
            // Check if the number of digits in the current integer is even
            if (countDigits(num) % 2 == 0) {
                // If the number of digits is even, increment the counter
                count++;
            }
        }
        
        // Return the count of integers with an even number of digits
        return count;
    }
    
    // Helper function to count the number of digits in an integer
    private int countDigits(int num) {
        // Initialize a counter variable to count the digits
        int count = 0;
        
        // Loop until the number becomes 0
        while (num != 0) {
            // Increment the counter for each digit
            count++;
            // Remove the last digit by integer division
            num /= 10;
        }
        
        // Return the count of digits
        return count;
    }
}


