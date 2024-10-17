import java.util.Scanner;

public class q_2 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        //  input to the number of elements in the sorted array
        System.out.print("Enter the number of elements in the sorted array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        //  array input from the user
        System.out.println("Enter the elements of the sorted array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int newLength = removeDuplicates(arr);

        // Printing the updated array and the new length
        System.out.println("The updated array without duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNew length: " + newLength);

        
    }


    public static int removeDuplicates(int[] arr) {
      
        if (arr.length == 0 || arr.length == 1) {
            return arr.length;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex + 1;
    }
}
