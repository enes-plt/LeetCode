class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>(); // Create a hash map to store the count of each number
        int goodPairs = 0; // Initialize the count of good pairs to 0

        for (int i = 0; i < nums.length; i++) { // Loop through each number in the array
            int num = nums[i]; // Get the current number
            if (countMap.containsKey(num)) { // Check if the current number is already in the hash map
                goodPairs += countMap.get(num); // If it is, add the count of this number to goodPairs
                countMap.put(num, countMap.get(num) + 1); // Increment the count of this number in the hash map
            }
            else {
                countMap.put(num, 1); // If it isn't in the hash map, add it with a count of 1
            }
        }

        return goodPairs; // Return the total number of good pairs
    }
}


//--------------------------------------------------------


class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0; // Initialize the count of good pairs to 0
        for (int i = 0; i < nums.length; i++) { // Outer loop to pick the first element of the pair
            for (int j = i; j < nums.length; j++) { // Inner loop to pick the second element of the pair
                if (nums[i] == nums[j] & i < j) { // Check if the elements are equal and indices are in the correct order
                    goodPairs++; // Increment the count of good pairs
                }
            }
        }
        return goodPairs; // Return the total number of good pairs
    }
}
