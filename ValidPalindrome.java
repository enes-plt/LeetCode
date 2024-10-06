public class Solution {
    public boolean isPalindrome(String s) {
        // Create a StringBuilder to store only alphanumeric characters in lowercase
        StringBuilder newStr = new StringBuilder();
        
        // Iterate through each character of the input string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Check if the character is a letter or a digit
            if (Character.isLetterOrDigit(c)) {
                // Convert the character to lowercase and append it to newStr
                newStr.append(Character.toLowerCase(c));
            }
        }
        
        // Compare the original cleaned string to its reversed version
        return newStr.toString().equals(newStr.reverse().toString());
    }
}


//---------------------------------------------------


class Solution {
    // Function to check if the given string is a palindrome, ignoring non-alphanumeric characters
    public boolean isPalindrome(String s) {
        // Initialize two pointers, one starting at the beginning (left) and the other at the end (right) of the string
        int l = 0;
        int r = s.length() - 1;

        // Loop until the two pointers meet in the middle
        while(l < r) {
            // Move the left pointer forward if the current character is not alphanumeric
            while(l < r && !alphaNum(s.charAt(l))) {
                l++;
            }
            // Move the right pointer backward if the current character is not alphanumeric
            while(r > l && !alphaNum(s.charAt(r))) {
                r--;
            }
            // Compare the characters at the left and right pointers (convert to lowercase for case-insensitivity)
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                // If the characters do not match, return false (it's not a palindrome)
                return false;
            }
            // Move both pointers closer towards the middle
            l++;
            r--;
        }
        // If all character comparisons matched, return true (the string is a palindrome)
        return true;
    }

    // Helper function to check if a character is alphanumeric (letter or digit)
    public boolean alphaNum(char c) {
        // Return true if the character is an uppercase letter, lowercase letter, or digit
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}

