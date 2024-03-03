import java.util.Scanner;

public class PerfectNumberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("Perfect numbers between " + lowerBound + " and " + upperBound + " are:");
        printPerfectNumbers(lowerBound, upperBound);

        scanner.close();
    }

    public static void printPerfectNumbers(int lowerBound, int upperBound) {
        for (int number = lowerBound; number <= upperBound; number++) {
            if (isPerfectNumber(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false; // Perfect numbers are positive integers greater than 1
        }

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }

        // Check if the sum of divisors is equal to the number
        return sum == number;
    }
}
