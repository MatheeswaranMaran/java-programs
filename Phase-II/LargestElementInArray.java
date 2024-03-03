import java.util.Scanner;
public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        // Create an array of the specified size
        int[] array = new int[size];
        // Ask the user to enter array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        // Find the largest element in the array
        int largest = findLargestElement(array);
        // Display the largest element
        System.out.println("The largest element in the array is: " + largest);
        scanner.close();
    }
    public static int findLargestElement(int[] array) {
        // Assume the first element as the largest initially
        int largest = array[0];
        // Iterate through the array to find the largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
}