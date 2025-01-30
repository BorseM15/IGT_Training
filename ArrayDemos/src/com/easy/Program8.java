package com.easy;

import java.util.Arrays;
import java.util.Collections;

public class Program8 {
    public static void main(String[] args) {
        // Sample array of Integers
        Integer[] array = {5, 2, 8, 1, 3};

        // Sorting the array in descending order using Arrays.sort() and Collections.reverseOrder()
        Arrays.sort(array, Collections.reverseOrder());

        // Printing the sorted array
        System.out.println("Sorted array in descending order: " + Arrays.toString(array));
    }
}
/*
 * class Program81 { void reverseWithoutReadymedemethod() { // Sample array
 * int[] array = {5, 2, 8, 1, 3};
 * 
 * // Sorting the array in ascending order first Arrays.sort(array);
 * 
 * // Reversing the array for descending order for (int i = 0; i < array.length
 * / 2; i++) { int temp = array[i]; array[i] = array[array.length - 1 - i];
 * array[array.length - 1 - i] = temp; }
 * 
 * // Printing the sorted array in descending order
 * System.out.println("Sorted array in descending order: " +
 * Arrays.toString(array));
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * }
 */