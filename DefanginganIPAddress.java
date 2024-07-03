class Solution {
    public String defangIPaddr(String address) {
        // Use the replace method to replace all occurrences of "." with "[.]"
        return address.replace(".", "[.]");
    }
  }
  
  
  
  //------------------------------------------------------
  
  class Solution {
    public String defangIPaddr(String address) {
        // Create a new StringBuilder to construct the defanged IP address
        StringBuilder defangedAddress = new StringBuilder();
  
        // Iterate over each character in the original address string using a regular for loop
        for (int i = 0; i < address.length(); i++) {
            // Get the current character
            char c = address.charAt(i);
  
            // If the current character is a '.', append "[.]" to the StringBuilder
            if (c == '.') {
                defangedAddress.append("[.]");
            } else {
                // Otherwise, append the current character to the StringBuilder
                defangedAddress.append(c);
            }
        }
  
        // Convert the StringBuilder to a String and return it
        return defangedAddress.toString();
    }
  }
  