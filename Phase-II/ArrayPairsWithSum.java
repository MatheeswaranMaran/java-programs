import java.util.Scanner;

public class ArrayPairsWithSum {
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

        // Ask the user to enter the required sum
        System.out.print("Enter the required sum: ");
        int requiredSum = scanner.nextInt();

        // Print pairs of array elements that generate the required sum
        System.out.println("Pairs of array elements that generate the required sum:");

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] + array[j] == requiredSum) {
                    System.out.println("(" + array[i] + ", " + array[j] + ")");
                }
            }
        }

        scanner.close();
    }
}
