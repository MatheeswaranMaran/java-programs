import java.util.Scanner;

public class UniqueElementsInArray {
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

        // Find and print unique elements in the array
        System.out.println("Unique elements in the array:");

        for (int i = 0; i < size; i++) {
            boolean isUnique = true;

            // Check if the current element is unique
            for (int j = 0; j < size; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }

            // If the element is unique, print it
            if (isUnique) {
                System.out.println(array[i]);
            }
        }

        scanner.close();
    }
}
