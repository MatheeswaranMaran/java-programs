import java.util.Scanner;

public class PalindromeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Palindrome words in the sentence:");
        printPalindromeWords(sentence);

        scanner.close();
    }

    public static void printPalindromeWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Iterate through each word
        for (String word : words) {
            // Check if the word is a palindrome
            if (isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }

    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false; // If characters do not match, it's not a palindrome
            }
        }
        return true; // If characters match, it's a palindrome
    }
}
