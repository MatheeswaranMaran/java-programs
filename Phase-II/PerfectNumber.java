import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false; // Perfect numbers are positive integers
        }

        int sum = 0;

        // Find proper divisors and calculate their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of proper divisors is equal to the number
        return sum == number;
    }
}
