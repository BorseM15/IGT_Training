package com.difficult;

import java.util.Arrays;
import java.util.Collections;
public class Program8 {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Original Array:");
        printArray(array);
        
        mergeSort(array, 0, array.length - 1);
        
        System.out.println("Sorted Array:");
        printArray(array);
    }

    // Merge Sort function
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;  // Find the middle point
            mergeSort(array, left, mid);           // Sort the first half
            mergeSort(array, mid + 1, right);      // Sort the second half
            
            merge(array, left, mid, right);        // Merge the two halves
        }
    }

    // Merge function to merge two sorted subarrays
    public static void merge(int[] array, int left, int mid, int right) {
        // Find the sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        // Create temporary arrays for the left and right subarrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        // Copy data to temporary arrays
        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);
        
        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        // Copy the remaining elements of leftArray, if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        
        // Copy the remaining elements of rightArray, if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Utility function to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
