class Solution {
    public double[] convertTemperature(double celsius) {
        // Convert Celsius to Kelvin
        double kelvin = celsius + 273.15;
        
        // Convert Celsius to Fahrenheit
        double fahrenheit = celsius * 1.80 + 32.00;
        
        // Return the results as an array with Kelvin first and Fahrenheit second
        return new double[]{kelvin, fahrenheit};
    }
}
