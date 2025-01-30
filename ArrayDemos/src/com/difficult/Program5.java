package com.difficult;

import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        int[] A = {1, 3};
        int[] B = {2};
        
        double result = findMedianSortedArrays(A, B);
        
        System.out.println("Median: " + result);
    }

    public static double findMedianSortedArrays(int[] A, int[] B) {
        if (A.length > B.length) {
            // Make sure A is the smaller array
            int[] temp = A;
            A = B;
            B = temp;
        }
        
        int n = A.length;
        int m = B.length;
        
        int left = 0, right = n;
        
        while (left <= right) {
            int partitionA = (left + right) / 2;
            int partitionB = (n + m + 1) / 2 - partitionA;
            
            // Edge case handling for partitioning
            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : A[partitionA - 1];
            int minRightA = (partitionA == n) ? Integer.MAX_VALUE : A[partitionA];
            
            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : B[partitionB - 1];
            int minRightB = (partitionB == m) ? Integer.MAX_VALUE : B[partitionB];
            
            // Check if the partition is correct
            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                // Correct partition
                if ((n + m) % 2 == 0) {
                    return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
                } else {
                    return Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                // Move left in A
                right = partitionA - 1;
            } else {
                // Move right in A
                left = partitionA + 1;
            }
        }
        
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}
