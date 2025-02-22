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
        System.out.print("Enter a string or number to check for palindrome: ");
        String input = scanner.nextLine();
        scanner.close();
        
        // Removing spaces and converting to lowercase for case-insensitive check
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();
        
        System.out.println("\nUsing Iterative Approach:");
        if (isPalindromeIterative(processedInput))
            System.out.println("\"" + input + "\" is a palindrome.");
        else
            System.out.println("\"" + input + "\" is not a palindrome.");
        
        System.out.println("\nUsing Recursive Approach:");
        if (isPalindromeRecursive(processedInput, 0, processedInput.length() - 1))
            System.out.println("\"" + input + "\" is a palindrome.");
        else
            System.out.println("\"" + input + "\" is not a palindrome.");
    }
}
