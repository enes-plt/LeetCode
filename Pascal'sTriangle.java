class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Create a list of lists to hold the entire Pascal's triangle
        List<List<Integer>> triangle = new ArrayList<>();
        
        // If the number of rows is zero, return an empty list
        if(numRows == 0){
            return triangle;
        }

        // Initialize the first row with a single element, 1
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row); // Add the first row to the triangle

        // Loop through to generate rows starting from the second row (i = 1)
        for(int i = 1; i < numRows; i++){
            // Get the previous row to calculate the current row's values
            List<Integer> previous_row = triangle.get(i - 1);
            
            // Initialize the current row
            List<Integer> current_row = new ArrayList<>();

            // The first element of every row is always 1
            current_row.add(1);

            // Loop through the previous row to calculate the middle values
            for(int j = 1; j < i; j++){
                // Each element is the sum of two elements from the previous row
                current_row.add(previous_row.get(j - 1) + previous_row.get(j));
            }

            // The last element of every row is always 1
            current_row.add(1);
            
            // Add the current row to the triangle
            triangle.add(current_row);
        }

        // Return the completed Pascal's triangle
        return triangle;
    }
}


//-------------------------------------------------------

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        // Initialize a list to hold the result, which will be a list of lists
        List<List<Integer>> res = new ArrayList<>();
        
        // Iterate through each row (from 0 to numRows - 1)
        for(int i = 0; i < numRows; i++) {
            // Create a new list for the current row
            List<Integer> list = new ArrayList<>();
            
            // Fill the current row with elements
            for(int j = 0; j <= i; j++) {
                // If we're not on the edge of the row, calculate the value based on the previous row
                if(j > 0 && i > 0 && res.get(i-1).size()-1 >= j) {
                    // j > 0, checks if the current element j is not on the left edge of the row.
                    // i > 0, ensures that we are not on the first row (i == 0).
                    // res.get(i-1).size()-1 >= j, checks if the current index j is within bounds 
                    // in the previous row (i - 1).

                    // Add the sum of the two numbers directly above the current position
                    list.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                } else {
                    // If we're on the edge of the row (or it's the first row), add 1
                    list.add(1);
                }
            }
            // Add the current row to the result
            res.add(list);
        }
        
        // Return the completed triangle
        return res;
    }
}
