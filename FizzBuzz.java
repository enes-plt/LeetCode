class Solution {
    // This method generates a list of strings representing the FizzBuzz sequence up to the number n
    public List<String> fizzBuzz(int n) {
        // Initialize an empty list to store the FizzBuzz results
        List<String> newFizzBuzz = new ArrayList<String>();

        // Loop through numbers from 1 to n
        for(int i = 1; i <= n; i++){
            // Check if the current number is divisible by both 3 and 15 (i.e., 15)
            if(i % 15 == 0){
                newFizzBuzz.add("FizzBuzz");
            }
            // Check if the current number is divisible by 3
            else if(i % 3 == 0){
                newFizzBuzz.add("Fizz");
            }
            // Check if the current number is divisible by 5
            else if(i % 5 == 0){
                newFizzBuzz.add("Buzz");
            }
            // If the current number is not divisible by 3 or 5, add the number as a string
            else{
                newFizzBuzz.add(Integer.toString(i));
            }
        }
        // Return the list containing the FizzBuzz sequence
        return newFizzBuzz;
    }
}
