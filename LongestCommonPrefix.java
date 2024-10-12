class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Check if the array is null or empty
        if (strs == null || strs.length == 0) {
            // If it is, return an empty string (no common prefix can exist)
            return "";
        }

        // Initialize the prefix with the first string in the array
        String prefix = strs[0];

        // Loop through the rest of the strings in the array, starting from the second string
        for (int i = 1; i < strs.length; i++) {

            // While the current string (strs[i]) does not start with the current prefix
            // `indexOf(prefix)` checks if the prefix exists at the beginning (index 0)
            while (strs[i].indexOf(prefix) != 0) {

                // Shorten the prefix by removing the last character
                // Continue shortening until a common prefix is found or prefix becomes empty
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty after shortening, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";  // Return an empty string if no common prefix exists
                }
            }
        }

        // Return the longest common prefix after comparing with all strings
        return prefix;
    }
}

//---------------------------------------------------------------

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();

        // Outer Loop, iterating through each character of the first string in the array
        for (int i = 0; i < strs[0].length(); i++) {

            // Inner loop checks all strings in the array, for example at index 0 for all words
            for (int j = 0; j < strs.length; j++) {
                
                if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    // Condition 1: i == strs[j].length() -> This checks if the index i has reached the end 
                    // of the current string strs[j]. If true, this means that the current string strs[j] is 
                    // shorter than the first string strs[0].

                    // Condition 2: strs[j].charAt(i) != strs[0].charAt(i) -> This checks if the character at 
                    // the current index i of the current string strs[j] does not match the character at the 
                    // same index of the first string strs[0].
                    
                    // Combined Logic: The condition i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i) has two parts:
                    // 1. End of string (i == strs[j].length()): If the current string is shorter than the first 
                    //string, return the current common prefix.
                    // 2. Character mismatch (strs[j].charAt(i) != strs[0].charAt(i)): If the characters at the
                    // same index in different strings do not match, return the current common prefix.

                    // Return the result built so far as the longest common prefix
                    return res.toString();
                }
            }
            // If all strings have the same character at index 'i', append it to the result
            res.append(strs[0].charAt(i));
        }
        // If the loop completes without finding any mismatch,
        // return the full string built as the common prefix
        return res.toString();
    }
}
