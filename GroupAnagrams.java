// Sorting
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Initialize a HashMap to store the grouped anagrams
        // The key is the sorted version of the string, and the value is a list of anagrams of that sorted key
        HashMap<String, List<String>> result = new HashMap<>();

        // Iterate through each string in the given array
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];

            // Convert the string into a character array and sort it
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            // Create a new sorted string from the sorted character array
            String sortedStr = new String(charArray);

            // If the sorted string is not already in the HashMap, add it with an empty list
            result.putIfAbsent(sortedStr, new ArrayList<>());

            // Add the original string to the corresponding list in the HashMap
            result.get(sortedStr).add(str);
        }

        // Convert the values of the HashMap into a list of lists and return
        return new ArrayList<>(result.values());
    }
}


//---------------------------------------------------------------

//Hash Table
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Initialize a HashMap to store the grouped anagrams
        // The key is a unique representation of character counts, and the value is a list of anagrams with the same character counts
        HashMap<String, List<String>> result = new HashMap<>();

        // Iterate through each string in the given array
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];

            // Create an array to count the frequency of each character (assuming only lowercase letters in alphabet)
            int[] count = new int[26];

            // Iterate through each character in the string and update its frequency in the count array
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                count[c - 'a']++; // Update the count for the corresponding character
            }

            // Convert the count array to a string representation to use as a key in the HashMap
            String key = Arrays.toString(count);

            // If the key is not already in the HashMap, add it with an empty list
            result.putIfAbsent(key, new ArrayList<>());

            // Add the original string to the corresponding list in the HashMap
            result.get(key).add(str);
        }

        // Convert the values of the HashMap into a list of lists and return
        return new ArrayList<>(result.values());
    }
}

