class Solution {
    public boolean isIsomorphic(String s, String t) {
        // HashMaps to store the mapping of characters from s to t and t to s
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        // Pointers to iterate through both strings
        int s1 = 0;
        int t1 = 0;

        // If the lengths of s and t are not equal, they cannot be isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        // Loop through the characters of both strings
        while (s1 < s.length() && t1 < t.length()) {
            // Check if there is a conflicting mapping
            // If s.charAt(s1) is already mapped to a different character than t.charAt(t1)
            // If t.charAt(t1) is already mapped to a different character than s.charAt(s1)
            if ((mapS.containsKey(s.charAt(s1)) && mapS.get(s.charAt(s1)) != t.charAt(t1)) ||
                (mapT.containsKey(t.charAt(t1)) && mapT.get(t.charAt(t1)) != s.charAt(s1))) {
                return false; // If either condition is true, s and t are not isomorphic
            }

            // Map the characters from s to t and t to s
            mapS.put(s.charAt(s1), t.charAt(t1));
            mapT.put(t.charAt(t1), s.charAt(s1));

            // Move to the next characters in the strings
            s1++;
            t1++1;
        }

        // If all characters match the mapping criteria, s and t are isomorphic
        return true;
    }
}
