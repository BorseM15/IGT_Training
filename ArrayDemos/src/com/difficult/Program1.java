package com.difficult;
import java.util.*;

//public class Program1 {
//    public static void main(String[] args) {
//        int[] array = {10, 2, -2, -20, 10};
//        int targetSum = -10;
//        
//        List<List<Integer>> subarrays = findSubarraysWithSum(array, targetSum);
//        
//        System.out.println("Subarrays with sum " + targetSum + ": " + subarrays);
//    }
//
//    public static List<List<Integer>> findSubarraysWithSum(int[] array, int targetSum) {
//        List<List<Integer>> result = new ArrayList<>();
//        Map<Integer, List<Integer>> prefixSumMap = new HashMap<>();
//        
//        // Initialize the map with 0 sum having an empty list (for handling cases where a subarray starts from index 0)
//        prefixSumMap.put(0, new ArrayList<>());
//        
//        int currentSum = 0;
//        
//        // Traverse the array
//        for (int i = 0; i < array.length; i++) {
//            currentSum += array[i];
//            
//            // If currentSum - targetSum exists in the map, we found valid subarrays
//            if (prefixSumMap.containsKey(currentSum - targetSum)) {
//                for (Integer startIdx : prefixSumMap.get(currentSum - targetSum)) {
//                    result.add(Arrays.asList(Arrays.copyOfRange(array, startIdx + 1, i + 1)));
//                }
//            }
//            
//            // Update the map with the current sum
//            prefixSumMap.putIfAbsent(currentSum, new ArrayList<>());
//            prefixSumMap.get(currentSum).add(i);
//        }
//        
//        return result;
//    }
//}
