package com.difficult;

public class Program9 {

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        
        System.out.println("Original Array:");
        printArray(array);
        
        quickSort(array, 0, array.length - 1);
        
        System.out.println("Sorted Array:");
        printArray(array);
    }

    // Quick Sort function
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, low, high);
            
            // Recursively sort the two subarrays
            quickSort(array, low, pivotIndex - 1);   // Left subarray
            quickSort(array, pivotIndex + 1, high);  // Right subarray
        }
    }

    // Partition function to rearrange the array around the pivot
    public static int partition(int[] array, int low, int high) {
        // Choose the last element as the pivot
        int pivot = array[high];
        
        // Pointer for the smaller element
        int i = (low - 1);
        
        // Loop through the array and rearrange the elements
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;
                
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        // Swap the pivot element with the element at i + 1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        // Return the pivot index
        return i + 1;
    }

    // Utility function to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
