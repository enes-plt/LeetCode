class Solution {
    public int theMaximumAchievableX(int num, int t) {
        // Calculate the maximum achievable value by adding twice the value of t to num.
        int x = num + 2 * t;
        
        // Return the calculated maximum achievable value.
        return x;
    }
}