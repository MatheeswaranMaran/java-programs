import java.util.Scanner;
public class SecondLargestElementInArray {
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
        // Find the second largest element in the array
        int secondLargest = 0;
        int largest = array[0];
        // Find the largest element in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }System.out.println("The second largest element in the array is: " + secondLargest);
    }
}