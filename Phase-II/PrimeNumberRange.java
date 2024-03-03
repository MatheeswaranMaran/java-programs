import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + " are:");
        printPrimeNumbers(lowerBound, upperBound);

        scanner.close();
    }

    public static void printPrimeNumbers(int lowerBound, int upperBound) {
        for (int number = lowerBound; number <= upperBound; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        if (number == 2) {
            return true; // 2 is a prime number
        }

        // Check if the number is divisible by any integer from 2 to sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by any integer, it's not prime
            }
        }

        return true; // If the number is not divisible by any integer, it's prime
    }
}
