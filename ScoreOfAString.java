class Solution {
    public int scoreOfString(String s) {
        int score = 0;  // Initialize the score variable to accumulate the total score
        
        // Convert the input string into a character array
        char[] chars = s.toCharArray();
        
        // Iterate over the character array from the first character to the second-to-last character
        for(int i = 0; i < chars.length - 1; i++) {
            // Calculate the absolute difference between adjacent characters
            // and add it to the score
            score += Math.abs(chars[i] - chars[i + 1]);
        }
        
        // Return the total accumulated score
        return score;
    }
}

//-----------------------------------------------

class Solution {
    public int scoreOfString(String s) {
        int score = 0;  // Initialize the score variable to accumulate the total score
        
        // Iterate directly over the string's characters from the first character to the second-to-last character
        for(int i = 0; i < s.length() - 1; i++) {
            // Calculate the absolute difference between adjacent characters
            // and add it to the score
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        
        // Return the total accumulated score
        return score;
    }
}

