import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0;
        int numberOfDigits = 0;

        originalNumber = number;

        // Count the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++numberOfDigits;
        }

        originalNumber = number;

        // Compute the result
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, numberOfDigits);
            originalNumber /= 10;
        }

        // Check if the number is an Armstrong number
        if (result == number) {
            return true;
        } else {
            return false;
        }
    }
}
