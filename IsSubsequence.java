class Solution {
    public boolean isSubsequence(String s, String t) {
        // Initialize two pointers, 'i' for string 's' and 'j' for string 't'
        int i = 0;
        int j = 0;

        // Edge case: if string 's' is empty, an empty string is always a subsequence
        if(s.length() == 0){
            return true;
        }
        
        // Loop through both strings as long as neither pointer exceeds the length of its string
        while(i < s.length() && j < t.length()){
            // If characters at 'i' and 'j' are the same, move the pointer 'i' for string 's' to check the next character
            if(s.charAt(i) == t.charAt(j)){
                i += 1; // Move to the next character in string 's'
                j += 1; // Move to the next character in string 't'
            }
            else{
                j += 1; // If characters don't match, only move pointer 'j' for string 't'
            }
        }
        
        // If the pointer 'i' has reached the end of string 's', all characters of 's' are found in 't' in order
        if(i == s.length()){
            return true;
        }
        else{
            return false;
        }
    }
}
