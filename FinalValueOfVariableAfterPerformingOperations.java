class Solution {
    // Method to calculate the final value after performing the operations
    public int finalValueAfterOperations(String[] operations) {
        // Initialize x to 0
        int x = 0;

        // Loop through each operation in the operations array
        for(int i = 0; i < operations.length; i++){
            // Check the second character of the operation to determine if it's an increment or decrement
            if(operations[i].charAt(1) == '-'){
                // If the second character is '-', decrement x
                x--;
            }
            else{
                // Otherwise, increment x
                x++;
            }
        }
        // Return the final value of x after all operations
        return x;   
    }
}


// ---------------------------------------------------------------------------------------

class Solution {
    // Method to calculate the final value after performing the operations
    public int finalValueAfterOperations(String[] operations) {
        // Initialize x to 0
        int x = 0;

        // Loop through each operation in the operations array
        for(int i = 0; i < operations.length; i++){
            // Check if the operation contains a '-' character to determine if it's a decrement
            if(operations[i].contains("-")){
                // If the operation contains '-', decrement x
                x--;
            } else {
                // Otherwise, increment x
                x++;
            }
        }
        // Return the final value of x after all operations
        return x;   
    }
}
