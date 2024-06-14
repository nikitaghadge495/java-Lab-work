package example.com;

import java.util.Scanner;

public class BinarySearch {
    // Iterative binary search method
    public static int binarySearchIterative(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if key is present at mid
            if (array[mid] == key) {
                return mid;
            }
            // If key greater, ignore left half
            if (array[mid] < key) {
                left = mid + 1;
            }
            // If key is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        // Key not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Get array elements from user
        System.out.println("Enter the elements of the array (sorted): ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Get key to find from user
        System.out.print("Enter the key to find: ");
        int key = scanner.nextInt();

        // Perform binary search
        int result = binarySearchIterative(array, key);
        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index : " + result+"  and Location is :"+(result+1));
        }

        scanner.close();
    }
}
