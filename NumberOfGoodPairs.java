class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] count = new int[101]; // Create an array to count occurrences of each number within the constraints

        // Count the occurrences of each number in the array
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        // Calculate the number of good pairs for each unique number
        for (int i = 0; i < count.length; i++) {
            ans += (count[i] * (count[i] - 1)) / 2; // Apply the formula to count good pairs.
                                                    // Formula used to determine the number of unique pairs that can be formed
                                                    // from n identical items. It ensures we account for all possible
                                                    // combinations of indices (i,j) where i < j.
                                                    // If you have n identical items, the number of ways you can pick 2 items out
                                                    // of n to form a pair is given by the combination formulaf you have n identical items,
                                                    // the number of ways you can pick 2 items out of n to form a pair is
                                                    // given by the combination formula. Like (n * (n-1)) / 2
        }

        return ans; // Return the total number of good pairs
    }
}



//-----------------------------------------------------

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
