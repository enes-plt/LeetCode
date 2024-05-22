// String Conversion and Reversal
class Solution {
  public boolean isPalindrome(int x) {
      // Convert the integer to a string
      String original = Integer.toString(x);
      
      // Reverse the string using StringBuilder
      String reversed = new StringBuilder(original).reverse().toString();
      
      // Check if the original string is equal to the reversed string
      return original.equals(reversed);
  }
}
// Time Complexity: O(n) 
// Space Complexity: O(n)



//--------------------------------------------

// Integer Reversal method
class Solution {
  public boolean isPalindrome(int x) {
    // A negative x is not a palindrome
    if (x < 0) {
      return false;
    }

    // Initialize variables to store the reversed x and the original x
    int reversedx = 0;
    int originalx = x;

    // Reverse the digits of the x
    while (x > 0) {
      // Get the last digit of the x
      int remainder = x % 10;
      // Build the reversed x
      reversedx = reversedx * 10 + remainder;
      // Remove the last digit from the x
      x /= 10;
    }

    // Check if the reversed x is the same as the original x
    return reversedx == originalx;
  }
}

// Time Complexity: O(n) 
// Space Complexity: O(1)

//----------------------------------------

class Solution {
  public boolean isPalindrome(int x) {
      // A negative number cannot be a palindrome
      // Also, if the last digit of the number is 0, the first digit must also be 0 (only 0 is valid)
      if (x < 0 || (x % 10 == 0 && x != 0)) {
          return false;
      }

      int reversedHalf = 0;
      // Reverse half of the number
      while (x > reversedHalf) {
          int remainder = x % 10;
          reversedHalf = reversedHalf * 10 + remainder;
          x /= 10;
      }

      // Check if the original number is equal to the reversed half
      // If the length is odd, disregard the middle digit by reversedHalf / 10
      return x == reversedHalf || x == reversedHalf / 10;
  }
}
