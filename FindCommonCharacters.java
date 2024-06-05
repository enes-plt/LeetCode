class Solution {
    public List<String> commonChars(String[] words) {
        // Get the character frequencies of the first word
        int[] commonCharCounts = countCharFrequencies(words[0]);
        
        // Find the intersection of character frequencies for all words
        for (int i = 1; i < words.length; i++) {
            commonCharCounts = intersectCharFrequencies(commonCharCounts, countCharFrequencies(words[i]));
        }
        
        // Prepare the result list of common characters
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (commonCharCounts[i] != 0) {
                // Convert the index i to the corresponding character (i.e., 0 -> 'a', 1 -> 'b', ..., 25 -> 'z')
                char currentChar = (char) ('a' + i);
                // Convert the character to a string
                String charString = String.valueOf(currentChar);
                // Add the character to the result list as many times as it appears in all words
                while (commonCharCounts[i] > 0) {
                    result.add(charString);
                    commonCharCounts[i]--;
                }
            }
        }
        return result;
    }

    // Method to find the intersection of two character frequency arrays
    private int[] intersectCharFrequencies(int[] freq1, int[] freq2) {
        int[] intersectedFrequencies = new int[26];
        // For each character (from 'a' to 'z'), take the minimum frequency from the two arrays
        for (int i = 0; i < 26; i++) {
            intersectedFrequencies[i] = Math.min(freq1[i], freq2[i]);
        }
        return intersectedFrequencies;
    }

    // Method to count the frequencies of each character in a string
    private int[] countCharFrequencies(String str) {
        int[] charFrequencies = new int[26];
        // For each character in the string, increment its corresponding frequency count
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charFrequencies[c - 'a']++;
        }
        return charFrequencies;
    }
}
