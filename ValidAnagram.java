class Solution {
    // Method to check if two strings are anagrams
    public boolean isAnagram(String s, String t) {
        // First check: If the lengths of the two strings are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false; // Return false if the lengths don't match
        }

        // Create an array to keep track of the frequency of each character in the strings
        // Since we are only dealing with lowercase English letters, we use an array of size 26
        int[] char_counts = new int[26];

        // Iterate over both strings simultaneously
        for (int i = 0; i < s.length(); i++) {
            // Increment the count for the character in string 's'
            char_counts[s.charAt(i) - 'a']++;

            // Decrement the count for the character in string 't'
            char_counts[t.charAt(i) - 'a']--;
        }

        // Use a for loop to check if all counts are 0
        for (int i = 0; i < char_counts.length; i++) {
            // If any count is not 0, it means the two strings do not have the same characters in the same frequency
            if (char_counts[i] != 0) {
                return false; // Return false if any discrepancy is found
            }
        }

        // If all counts are 0, the strings are anagrams
        return true;
    }
}


//------------------------------------------------------------------------


class Solution {
    // Method to check if two strings are anagrams
    public boolean isAnagram(String s, String t) {
        // Convert both strings into character arrays
        // This allows us to sort the characters in each string
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        // Sort the character arrays
        // Sorting ensures that if the strings are anagrams, their sorted forms will be identical
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Compare the two sorted arrays
        // If they are equal, it means the strings are anagrams
        return Arrays.equals(sChars, tChars); 
    }
}

