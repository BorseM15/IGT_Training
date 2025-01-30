package com.difficult;

import java.util.Arrays;
public class Program7 {
    public static void main(String[] args) {
        int[] array = {2, 3, -2, 4};
        
        int result = maxProduct(array);
        
        System.out.println("Maximum product of subarray: " + result);
    }

    // Function to find the maximum product subarray
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max_product = nums[0];
        int min_product = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // If the current number is negative, swap max_product and min_product
            if (nums[i] < 0) {
                int temp = max_product;
                max_product = min_product;
                min_product = temp;
            }

            // Update the max_product and min_product for the current element
            max_product = Math.max(nums[i], max_product * nums[i]);
            min_product = Math.min(nums[i], min_product * nums[i]);

            // Update the result to store the maximum product found so far
            result = Math.max(result, max_product);
        }

        return result;
    }
}
