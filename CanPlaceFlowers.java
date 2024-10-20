class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // If no flowers need to be placed, return true
        if (n == 0) {
            return true;
        }
        
        // Loop through each position in the flowerbed
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current spot is empty, and the previous and next spots are also empty or boundaries
            if (flowerbed[i] == 0 && 
                (i == 0 || flowerbed[i - 1] == 0) && // Check left boundary or adjacent left plot
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) { // Check right boundary or adjacent right plot
                n--; // Place a flower and decrease the number of flowers left to place

                // If all flowers have been placed, return true
                if (n == 0) {
                    return true;
                }

                flowerbed[i] = 1; // Mark the current plot as occupied to prevent adjacent placements
            }
        }
        // If not all flowers could be placed, return false
        return false;
    }
}
