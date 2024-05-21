class Solution {
    public int matrixScore(int[][] grid) {
        // Get the number of rows and columns in the grid
        int numRows = grid.length;
        int numColumns = grid[0].length;

        // Step 1: Ensure the leftmost column has all 1s by flipping rows if needed  

        // Flip rows if necessary to ensure the first column is all 1s
        for (int row = 0; row < numRows; ++row) {
            if (grid[row][0] == 0) { // Check if the first column of the current row is 0
                                    // If it's 0, flip all elements in the row (0 to 1 or 1 to 0)
                for (int col = 0; col < numColumns; ++col) {
                    grid[row][col] ^= 1;
                }
            }
        }
        
        
        // Step 2: Calculate the maximum score by possibly flipping columns

        int totalScore = 0;
        // Calculate the score using bitwise operations
        for (int col = 0; col < numColumns; ++col) {
            int numberOfOnesInColumn = 0;
            for (int row = 0; row < numRows; ++row) {
                numberOfOnesInColumn += grid[row][col]; // Count the number of 1s in the current column
            }
            // Calculate the score directly using bitwise operations
            // Multiply the maximum count of 1s or 0s in the column by 2 raised to the power of (numColumns - col - 1)
            // This gives the score contribution of the current column
            totalScore += Math.max(numberOfOnesInColumn, numRows - numberOfOnesInColumn) * (1 << (numColumns - col - 1));
        }
        
        return totalScore;
    }
}
