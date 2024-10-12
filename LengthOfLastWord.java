class Solution {
    public int lengthOfLastWord(String s) {
        // 'endChar' is initialized to the last index of the string.
        int endChar = s.length() - 1;
        // 'length' will store the length of the last word.
        int length = 0;

        // First, we skip any trailing spaces by moving 'endChar' to the last non-space character.
        while(s.charAt(endChar) == ' ') {
            endChar -= 1;
        }

        // Now, we count the characters in the last word by moving 'endChar' backward
        // until we either reach a space or the beginning of the string.
        while(endChar >= 0 && s.charAt(endChar) != ' ') {
            length += 1;  // Increment 'length' for each character in the last word.
            endChar -= 1; // Move to the previous character.
        }

        // Return the length of the last word.
        return length;
    }
}

//----------------------------------------------------------------

class Solution {
    public int lengthOfLastWord(String s) {
        // 'length' will store the length of the last word.
        int length = 0;

        // Loop starts from the last character of the string and moves backwards.
        for(int i = s.length() - 1; i >= 0; i--) {
            // If the current character is not a space, it is part of the last word.
            if(s.charAt(i) != ' ') {
                length++;  // Increment the length of the last word.
            }
            else {
                // If a space is encountered and 'length' is greater than 0, 
                // it means we have already found the last word, so we return the length.
                if(length > 0) {
                    return length;
                }
            }
        }
        // If the loop completes, return the length (handles cases like no spaces at all).
        return length;
    }
}
