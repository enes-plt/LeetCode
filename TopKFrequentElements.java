//Sorting
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Create a HashMap to count the frequency of each number in the input array
        // Key: number in the array, Value: frequency of that number
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // If the number already exists in the map, increment its count, otherwise set it to 1
            count.put(num, count.getOrDefault(num, 0) + 1); //map.getOrDefault(key, defaultValue);
                                                            //getOrDefault(key, defaultValue) method is used with Map objects (such as HashMap). 
                                                            //It allows you to retrieve the value associated with a 
                                                            //specified key, or return a default value if the key is 
                                                            //not present in the map.
        }
        // At this point, `count` contains the frequency of each number in `nums`

        // Step 2: Create a list to store the frequencies and corresponding numbers as pairs
        // Each element in the list is an integer array of size 2: {frequency, number}
        List<int[]> arr = new ArrayList<>();
        // Convert the entry set of the HashMap into an array for iteration
        
        // HashMap.Entry<Integer, Integer> represents each key-value pair in the map
        HashMap.Entry<Integer, Integer>[] entries = count.entrySet().toArray(new HashMap.Entry[0]);
        //entrySet() method returns a 'Set' view of all the key-value pairs (or entries) contained in the map.
        //getKey() returns the key associated with the entry.
        //getValue() returns the value associated with the entry.

        // Iterate through each entry in the array to add frequency and number pairs to the list
        for (int i = 0; i < entries.length; i++) {
            // Create a new array where the first element is the frequency (value), and the second is the number (key)
            arr.add(new int[] {entries[i].getValue(), entries[i].getKey()});
        }
        // At this point, `arr` contains pairs of {frequency, number} for each unique number in `nums`

        // Step 3: Sort the list in descending order based on the frequency
        // This sorting helps us in easily getting the top `k` most frequent elements
        arr.sort((a, b) -> b[0] - a[0]); // Compare based on the first element (frequency) of each pair
        // After sorting, the most frequent element will be at the beginning of the list

        // Step 4: Create a result array to store the top k frequent numbers
        int[] result = new int[k]; // Array to hold the `k` most frequent numbers
        
        // Iterate through the first `k` elements of the sorted list
        for (int i = 0; i < k; i++) {
            // Extract the number (second element of each pair) and add it to the result array
            result[i] = arr.get(i)[1];
        }
        // At this point, `result` contains the `k` most frequent elements from `nums`

        // Step 5: Return the result array containing the top `k` frequent numbers
        return result;
    }
}

//---------------------------------------------------------

//Heap
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Create a HashMap to count the frequency of each number in the input array
        // Key: number in the array, Value: frequency of that number
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // If the number already exists in the map, increment its count, otherwise set it to 1
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        // At this point, `count` contains the frequency of each number in `nums`

        // Step 2: Create a min-heap (priority queue) to keep track of the top k elements
        // Each element in the heap is an array of size 2: {frequency, number}
        // Use a custom comparator to compare based on frequency (min-heap based on frequency)
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        // Convert the entry set of the map to an array to iterate using a regular for loop
        HashMap.Entry<Integer, Integer>[] entries = count.entrySet().toArray(new HashMap.Entry[0]);
        
        // Step 3: Iterate through each entry in the frequency map using a regular for loop
        for (int i = 0; i < entries.length; i++) {
            HashMap.Entry<Integer, Integer> entry = entries[i];
            // Add the frequency and number as a pair to the heap
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            
            // If the heap size exceeds k, remove the element with the smallest frequency
            // This ensures the heap always contains the k most frequent elements
            if (heap.size() > k) {
                heap.poll();
            }
        }
        // At this point, the heap contains the k most frequent elements

        // Step 4: Create a result array to store the top k frequent numbers
        int[] result = new int[k];
        
        // Extract the elements from the heap and store them in the result array
        // Iterate using a regular for loop
        for (int i = 0; i < k; i++) {
            // Poll the heap to get the element with the highest frequency and store the number in the result array
            result[i] = heap.poll()[1];
        }

        // Step 5: Return the result array containing the top k frequent numbers
        return result;
    }
}

//-------------------------------------------------------------------

//Bucket Sort
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Create a HashMap to count the frequency of each number in the input array
        // Key: number in the array, Value: frequency of that number
        HashMap<Integer, Integer> count = new HashMap<>();
        
        // Step 2: Create an array of lists to store numbers based on their frequencies
        // The index of the array represents the frequency
        List<Integer>[] freq = new List[nums.length + 1];
        
        // Initialize each list in the frequency array
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        // Step 3: Count the frequency of each number in the input array using a regular loop
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        // At this point, `count` contains the frequency of each number in `nums`

        // Step 4: Populate the frequency array with the numbers based on their frequency
        // Iterate through the entries in the map using a regular loop
        HashMap.Entry<Integer, Integer>[] entries = count.entrySet().toArray(new HashMap.Entry[0]);
        for (int i = 0; i < entries.length; i++) {
            int frequency = entries[i].getValue();
            int number = entries[i].getKey();
            // Add the number to the corresponding frequency list
            freq[frequency].add(number);
        }

        // Step 5: Create a result array to store the top k frequent numbers
        int[] res = new int[k];
        int index = 0;

        // Step 6: Traverse the frequency array from highest to lowest frequency
        // Fill the result array with the top k frequent numbers
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            // Use a regular loop to iterate over the list at the current frequency
            for (int j = 0; j < freq[i].size(); j++) {
                res[index++] = freq[i].get(j);
                // If we have found k elements, return the result
                if (index == k) {
                    return res;
                }
            }
        }

        // Step 7: Return the result array containing the top k frequent numbers
        return res;
    }
}
