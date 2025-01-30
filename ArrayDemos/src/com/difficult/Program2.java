package com.difficult;

public class Program2 {
    public static void main(String[] args) {
        int[] array = {5, -3, 5};
        
        int result = maxCircularSubarraySum(array);
        
        System.out.println("Maximum Circular Subarray Sum: " + result);
    }

    // Function to find the maximum circular subarray sum
    public static int maxCircularSubarraySum(int[] array) {
        int maxKadane = kadane(array);
        int totalSum = 0;
        
        // Calculate the total sum of the array
        for (int num : array) {
            totalSum += num;
        }
        
        // Invert the array elements to find the minimum subarray sum
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];
        }
        
        // Find the minimum subarray sum using Kadane's algorithm
        int minKadane = kadane(array);
        
        // If all elements are negative, return the maximum subarray sum from Kadane's algorithm
        if (totalSum + minKadane == 0) {
            return maxKadane;
        }
        
        // The maximum circular subarray sum is the maximum of:
        // - The maximum subarray sum (Kadane's)
        // - The total sum of the array minus the minimum subarray sum (Kadane's for inverted array)
        return Math.max(maxKadane, totalSum + minKadane);
    }

    // Kadane's Algorithm to find the maximum subarray sum
    public static int kadane(int[] array) {
        int maxSum = array[0];
        int currentSum = array[0];
        
        for (int i = 1; i < array.length; i++) {
            currentSum = Math.max(array[i], currentSum + array[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}

