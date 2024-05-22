class Solution {
    public int getMaximumGold(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxGold = 0;
        int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}}; // Define directions: left, right, up, down
        boolean[][] visited = new boolean[rows][cols]; // Keep track of visited cells

        // Perform DFS from each cell with gold
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] > 0) { // If cell has gold
                    maxGold = Math.max(maxGold, dfs(grid, i, j, visited, directions)); // Update maxGold with the maximum gold collected from this cell
                }
            }
        }

        return maxGold; // Return the maximum gold collected
    }

    // Depth First Search (DFS) function to explore the grid
    private int dfs(int[][] grid, int row, int col, boolean[][] visited, int[][] directions) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Base cases for DFS termination
        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == 0 || visited[row][col]) {
            return 0; // If out of bounds or cell has no gold or already visited, return 0
        }

        visited[row][col] = true; // Mark current cell as visited
        int maxGold = 0;

        // Explore adjacent cells
        for (int d = 0; d < directions.length; d++) {
            int nextRow = row + directions[d][0];
            int nextCol = col + directions[d][1];
            maxGold = Math.max(maxGold, dfs(grid, nextRow, nextCol, visited, directions)); // Recursively explore adjacent cells
        }

        visited[row][col] = false; // Backtrack: Mark current cell as not visited for other paths
        return maxGold + grid[row][col]; // Return the total gold collected including the gold from the current cell
    }
}
