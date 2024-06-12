class Solution {
    public int findPermutationDifference(String s, String t) {
        // Array to store the position of each character in string 's'
        int[] positionInS = new int[26];

        // Get the length of the strings 's' and 't'
        int length = s.length();

        // Initialize the total permutation difference to zero
        int totalDifference = 0;
        
        // Record the position of each character in string 's'
        for (int i = 0; i < length; i++) {
            positionInS[s.charAt(i) - 'a'] = i; // Convert character to an index (0-25) by subtracting 'a'
        }
        
        // Calculate the total permutation difference
        // by comparing the position of each character in 't' with its position in 's'
        for (int i = 0; i < length; i++) {
            totalDifference += Math.abs(positionInS[t.charAt(i) - 'a'] - i);
        }
        
        // Return the total permutation difference
        return totalDifference;
    }
}
