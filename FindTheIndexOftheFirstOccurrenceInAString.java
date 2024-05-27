class Solution {
    public int strStr(String haystack, String needle) {
        // Loop through the haystack, stopping so there's enough room for the needle to fit
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the substring of haystack starting at i and of the same length as needle equals the needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                // If a match is found, return the starting index
                return i;
            }
        }
        // If no match is found, return -1
        return -1;
    }
}
