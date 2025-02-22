import java.util.Scanner;

public class PalindromeChecker {
    // Function to check palindrome iteratively
    public static boolean isPalindromeIterative(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to check palindrome recursively
    public static boolean isPalindromeRecursive(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return isPalindromeRecursive(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string or number to check if it's a palindrome: ");
        String input = scanner.nextLine();
        
        // Removing non-alphanumeric characters and converting to lowercase
        String processedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        System.out.println("\nUsing Iterative Approach:");
        System.out.println(input + (isPalindromeIterative(processedInput) ? " is a palindrome." : " is not a palindrome."));
        
        System.out.println("\nUsing Recursive Approach:");
        System.out.println(input + (isPalindromeRecursive(processedInput, 0, processedInput.length() - 1) ? " is a palindrome." : " is not a palindrome."));
        
        scanner.close();
    }
}