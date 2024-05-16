class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Check for an empty array
        if (strs == null || strs.length == 0) {
            return "";
        }
  
        // Initialize the prefix with the first string
        String prefix = strs[0];
  
        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {

            // While the current string does not start with the current prefix
            while (strs[i].indexOf(prefix) != 0) {

                // Shorten the prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
  }
  