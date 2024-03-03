import java.util.Scanner;

public class FrequencyOfElements {
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

        // Calculate the frequency of each element in the array
        int[] frequency = new int[size]; // array to store frequencies

        for (int i = 0; i < size; i++) {
            frequency[i] = -1; // Initialize frequency array with -1
        }

        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    count++;
                    // To avoid counting same element again
                    frequency[j] = 0;
                }
            }
            if (frequency[i] != 0) {
                frequency[i] = count;
            }
        }
        // Display the frequency of each element
        System.out.println("Frequency of each element in the array:");
        for (int i = 0; i < size; i++) {
            if (frequency[i] != 0) {
                System.out.println("Element " + array[i] + ": " + frequency[i] + " times");
            }
        }
    }
}
