import java.util.Scanner;

public class q_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of steps to rotate the array to the right: ");
        int k = scanner.nextInt();

        // Rotate the array
        rotate(arr, k);

        // Printing the rotated array
        System.out.println("Rotated array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    //  rotate the array by k steps
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  

        // Reverse the entire array
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
