class Solution {
    // Helper method to translate Roman numeral characters to integers
    private int translater(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; // If an invalid character is encountered, return 0
        }
    }

    // Main method to convert Roman numerals to integer
    public int romanToInt(String s) {
        int sum = 0;
        int cur = translater(s.charAt(0)); // Initialize the current value with the first character of the input string

        // Loop through the input string, starting from the second character
        for (int i = 1; i < s.length(); i++){
            int next = translater(s.charAt(i)); // Get the integer value of the next Roman numeral character

            // If the current numeral is less than the next numeral, subtract the current value from the total sum
            if (cur < next){
                sum -= cur;
            }
            // Otherwise, add the current value to the total sum
            else{
                sum += cur;
            }
            cur = next; // Update the current value for the next iteration
        }
        sum += cur; // Add the value of the last numeral to the total sum
        return sum; // Return the final sum
    }
}
