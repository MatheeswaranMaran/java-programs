import java.util.Scanner;
public class DisplayArrayElements {
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
        // Display the array elements
        System.out.println("The elements of the array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + array[i]);
        }
    }
}