// Question 2: Two Sum
//  Given an array of integers and a target sum, return indices of two numbers such that they add up to the target.

import java.util.HashMap;
import java.util.Scanner;

public class q_2 {
    
    public static int[] findTwoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // Calculate the difference between the target and the current element
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If it exists, return the indices
                return new int[] { map.get(complement), i };
            }

            // Otherwise, store the current element in the map
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[] {};
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        //  array input from the user
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        //  input the target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

      
        int[] result = findTwoSum(nums, target);

       
        if (result.length == 2) {
            System.out.println("Indices of the two numbers are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No solution found.");
        }

        
    }
}
