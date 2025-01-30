package com.demos;

import java.util.Arrays;
import java.util.*;

public class Demo1 {
	// Solutions for Array Questions in Java

	// 1. Find the sum of all elements in an array
	public int sumOfArray(int[] arr) {
	    int sum = 0;
	    for (int num : arr) {
	        sum += num;
	    }
	    return sum;
	}

	// 2. Find the largest element in an array
	public int findLargest(int[] arr) {
	    int largest = arr[0];
	    for (int num : arr) {
	        if (num > largest) {
	            largest = num;
	        }
	    }
	    return largest;
	}

	// 3. Find the smallest element in an array
	public int findSmallest(int[] arr) {
	    int smallest = arr[0];
	    for (int num : arr) {
	        if (num < smallest) {
	            smallest = num;
	        }
	    }
	    return smallest;
	}

	// 4. Reverse an array
	public int[] reverseArray(int[] arr) {
	    int start = 0, end = arr.length - 1;
	    while (start < end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }
	    return arr;
	}

	// 5. Check if an array contains a specific value
	public boolean containsValue(int[] arr, int value) {
	    for (int num : arr) {
	        if (num == value) {
	            return true;
	        }
	    }
	    return false;
	}

	// 6. Copy all elements of one array into another array
	public int[] copyArray(int[] arr) {
	    int[] copy = new int[arr.length];
	    for (int i = 0; i < arr.length; i++) {
	        copy[i] = arr[i];
	    }
	    return copy;
	}

	// 7. Sort an array in ascending order
	public int[] sortAscending(int[] arr) {
	    Arrays.sort(arr);
	    return arr;
	}

	// 8. Sort an array in descending order
	public int[] sortDescending(int[] arr) {
	    Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
	    Arrays.sort(temp, Collections.reverseOrder());
	    return Arrays.stream(temp).mapToInt(Integer::intValue).toArray();
	}

	// 9. Find the second largest element in an array
	public int findSecondLargest(int[] arr) {
	    int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
	    for (int num : arr) {
	        if (num > largest) {
	            secondLargest = largest;
	            largest = num;
	        } else if (num > secondLargest && num != largest) {
	            secondLargest = num;
	        }
	    }
	    return secondLargest;
	}

	// 10. Remove duplicates from an array
	public int[] removeDuplicates(int[] arr) {
	    Set<Integer> set = new LinkedHashSet<>();
	    for (int num : arr) {
	        set.add(num);
	    }
	    return set.stream().mapToInt(Integer::intValue).toArray();
	}

	// 11. Find the frequency of each element in an array
	public Map<Integer, Integer> elementFrequency(int[] arr) {
	    Map<Integer, Integer> frequency = new HashMap<>();
	    for (int num : arr) {
	        frequency.put(num, frequency.getOrDefault(num, 0) + 1);
	    }
	    return frequency;
	}

	// 12. Print all even numbers in an array
	public List<Integer> getEvenNumbers(int[] arr) {
	    List<Integer> evens = new ArrayList<>();
	    for (int num : arr) {
	        if (num % 2 == 0) {
	            evens.add(num);
	        }
	    }
	    return evens;
	}

	// 13. Print all odd numbers in an array
	public List<Integer> getOddNumbers(int[] arr) {
	    List<Integer> odds = new ArrayList<>();
	    for (int num : arr) {
	        if (num % 2 != 0) {
	            odds.add(num);
	        }
	    }
	    return odds;
	}

	// 14. Find the sum of even and odd elements in an array
	public Map<String, Integer> sumEvenOdd(int[] arr) {
	    int evenSum = 0, oddSum = 0;
	    for (int num : arr) {
	        if (num % 2 == 0) {
	            evenSum += num;
	        } else {
	            oddSum += num;
	        }
	    }
	    Map<String, Integer> result = new HashMap<>();
	    result.put("Even", evenSum);
	    result.put("Odd", oddSum);
	    return result;
	}

	// 15. Check if two arrays are equal
	public boolean areArraysEqual(int[] arr1, int[] arr2) {
	    if (arr1.length != arr2.length) return false;
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    return Arrays.equals(arr1, arr2);
	}

	// 16. Merge two arrays into one
	public int[] mergeArrays(int[] arr1, int[] arr2) {
	    int[] merged = new int[arr1.length + arr2.length];
	    System.arraycopy(arr1, 0, merged, 0, arr1.length);
	    System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
	    return merged;
	}

}
