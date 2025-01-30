package com.difficult;

public class Program3 {
    public static void main(String[] args) {
        int[] array = {6, 2, 4, 0, 5, 1, 1, 4, 2, 9};
        
        int result = minJumps(array);
        
        System.out.println("Minimum number of jumps to reach the end: " + result);
    }

    // Function to find the minimum number of jumps to reach the end of the array
    public static int minJumps(int[] array) {
        if (array.length <= 1) {
            return 0; // No jump needed if the array has 1 or fewer elements
        }
        
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        
        for (int i = 0; i < array.length; i++) {
            // Update the farthest we can reach from the current position
            farthest = Math.max(farthest, i + array[i]);
            
            // If we've reached the end of the range for the current jump
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                
                // If we have reached or passed the last index, return the result
                if (currentEnd >= array.length - 1) {
                    return jumps;
                }
            }
        }
        
        return -1; // If we can't reach the end, return -1 (this shouldn't happen for valid input)
    }
}

