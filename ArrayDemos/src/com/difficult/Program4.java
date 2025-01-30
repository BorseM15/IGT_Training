package com.difficult;

import java.util.Arrays;
import java.util.HashMap;

public class Program4 {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 1, 0, 0};
        
        int result = maxLength(array);
        
        System.out.println("Maximum length of subarray with equal 0s and 1s: " + result);
    }

    // Function to find the maximum length of subarray with equal 0s and 1s
    public static int maxLength(int[] array) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int current_sum = 0;
        int maxLength = 0;
        
        // Initialize sum_map with the base case: current_sum = 0 at index -1
        sumMap.put(0, -1);
        
        // Traverse the array
        for (int i = 0; i < array.length; i++) {
            // Convert 0 to -1
            current_sum += (array[i] == 0) ? -1 : 1;
            
            // Check if current_sum has been seen before
            if (sumMap.containsKey(current_sum)) {
                // Calculate the length of the subarray
                int length = i - sumMap.get(current_sum);
                maxLength = Math.max(maxLength, length);
            } else {
                // Store the first occurrence of current_sum
                sumMap.put(current_sum, i);
            }
        }
        
        return maxLength;
    }
}

