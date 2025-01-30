package com.difficult;

import java.util.Arrays;

public class Program6 {
    public static void main(String[] args) {
        int[] array = {1, 4, 45, 6, 10, 19};
        int target = 51;
        
        int result = smallestSubarrayWithSumGreaterThanTarget(array, target);
        
        System.out.println("Smallest subarray length: " + result);
    }

    // Function to find the smallest subarray with a sum greater than the target
    public static int smallestSubarrayWithSumGreaterThanTarget(int[] array, int target) {
        int n = array.length;
        int start = 0, sum = 0;
        int minLength = Integer.MAX_VALUE;
        
        // Loop through the array with the 'end' pointer
        for (int end = 0; end < n; end++) {
            sum += array[end]; // Add the current element to the sum
            
            // Shrink the window as much as possible while the sum is greater than the target
            while (sum > target) {
                // Update the minimum length of the subarray
                minLength = Math.min(minLength, end - start + 1);
                
                // Shrink the window by moving the 'start' pointer to the right
                sum -= array[start];
                start++;
            }
        }
        
        // Return the result, or -1 if no subarray is found
        return (minLength == Integer.MAX_VALUE) ? -1 : minLength;
    }
}
