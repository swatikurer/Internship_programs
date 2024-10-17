//  Question 1: Find the maximum element
//  Given an array of integers, find the maximum element.

import java.util.Scanner;

public class q_2 {
    public static void main(String[] args) {
        // Creating a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

       
        int[] arr = new int[n];

        // array input from the user
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Assuming the first element is the maximum
        int max = arr[0];
        // Traversing the array to find the maximum element
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The maximum element in the array is: " + max);

       
    }
}
