class Solution {
    public List<String> commonChars(String[] words) {
        // Initialize common character counts with the first word's frequencies
        int[] commonCharCounts = countCharFrequencies(words[0]);
        
        // Intersect the character frequencies with the rest of the words
        for (int i = 1; i < words.length; i++) {
            commonCharCounts = intersectCharFrequencies(commonCharCounts, countCharFrequencies(words[i]));
        }
        
        // Construct the result list based on the common character counts
        List<String> result = new ArrayList<>();
        // Iterate over each character index (0 to 25) representing 'a' to 'z'
        for (int i = 0; i < 26; i++) {
            // Check if the character frequency is greater than 0, meaning it's common among all strings
            if (commonCharCounts[i] != 0) {
                char currentChar = (char) ('a' + i); // Convert the index back to its corresponding character
                String charString = String.valueOf(currentChar); // Create a string representing the current character
                // Add the character to the result list as many times as its frequency
                while (commonCharCounts[i] > 0) {
                    result.add(charString);
                    commonCharCounts[i]--; // Decrease the frequency count after adding the character
                }
            }
        }
        return result;
    }

    // Helper function to count character frequencies in a string
    private int[] countCharFrequencies(String str) {
        int[] charFrequencies = new int[26];  // Initialize an array to store frequencies of each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);  // Get the current character
            charFrequencies[c - 'a']++;  // Increment the frequency of the current character
        }
        return charFrequencies;  // Return the frequency array
    }

    // Helper function to intersect two frequency arrays representing character frequencies by taking the minimum value for each character.
    private int[] intersectCharFrequencies(int[] freq1, int[] freq2) {
        int[] intersectedFrequencies = new int[26]; // Initialize an array to store intersected frequencies
        // Iterate over each character's frequency
        for (int i = 0; i < 26; i++) {
            intersectedFrequencies[i] = Math.min(freq1[i], freq2[i]); // Take the minimum frequency for each character from both arrays
                                                                    // freq1 The first array of character frequencies.
                                                                    // freq2 The second array of character frequencies.
        } 
        return intersectedFrequencies; // Return the intersected frequencies array
    }
}