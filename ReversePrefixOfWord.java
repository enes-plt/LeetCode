class Solution {
    public String reversePrefix(String word, char targetChar) {
      // Find the index of the target character in the word
      int indexOfTargetChar = word.indexOf(targetChar);
      // If the character doesn't exist in the word, return the word as it is
      if (indexOfTargetChar == -1) 
          return word;
          
      // Convert the word to a character array for easy manipulation
      char[] characters = word.toCharArray();
      
      // Define pointers for reversing the characters
      int start = 0; // Start pointer
      int end = indexOfTargetChar; // End pointer
      
      // Reverse the characters until the start pointer is less than the end pointer
      while (start < end) {
          // Swap characters at the start and end positions
          char temp = characters[start];
          characters[start] = characters[end];
          characters[end] = temp;
          // Move the start pointer forward and the end pointer backward
          start++;
          end--;
      }
      // Convert the character array back to a string and return it
      return new String(characters);
    }
  }