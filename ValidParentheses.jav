// using stack to solve the problem
class Solution {
    public boolean isValid(String s) {
        // Create a stack to store opening brackets
        Stack<Character> bracketStack = new Stack<>();
        
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // If the character is an opening bracket, push it onto the stack
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                bracketStack.push(currentChar);
            } else {
                // If the character is a closing bracket
                // Check if the stack is empty, indicating unmatched closing bracket
                if (bracketStack.isEmpty()) {
                    return false;
                }
                
                // Pop the top element from the stack
                char topBracket = bracketStack.pop();
                
                // Check if the current closing bracket matches the corresponding opening bracket
                if ((currentChar == ')' && topBracket != '(') || 
                    (currentChar == '}' && topBracket != '{') || 
                    (currentChar == ']' && topBracket != '[')) {
                    return false;
                }
            }
        }
        
        // Check if there are any unmatched opening brackets left in the stack
        return bracketStack.isEmpty();
    }
}

//----------------------------------------------------

class Solution {
    public boolean isValid(String s) {
        // Use a dynamic array to simulate the stack behavior
        char[] brackets = new char[s.length()];
        int index = 0;

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // If the character is an opening bracket, store it in the array
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                brackets[index++] = currentChar;
            } else {
                // If the character is a closing bracket
                // Check if the "stack" is empty, indicating unmatched closing bracket
                if (index == 0) {
                    return false;
                }

                // Get the top element from the "stack"
                char topBracket = brackets[--index];

                // Check if the current closing bracket matches the corresponding opening bracket
                if ((currentChar == ')' && topBracket != '(') || 
                    (currentChar == '}' && topBracket != '{') || 
                    (currentChar == ']' && topBracket != '[')) {
                    return false;
                }
            }
        }

        // Check if there are any unmatched opening brackets left in the "stack"
        return index == 0;
    }
}
