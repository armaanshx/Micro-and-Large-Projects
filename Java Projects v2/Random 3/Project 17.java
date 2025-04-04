\import java.util.Scanner;

public class Fibonacci {
    
    // Recursive method for Fibonacci
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    
    // Iterative method for Fibonacci
    public static void fibonacciIterative(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + " " + second);
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();
        
        System.out.println("\nUsing Iterative Approach:");
        fibonacciIterative(n);
        
        System.out.println("\nUsing Recursive Approach:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        
        System.out.println();
        scanner.close();
    }
}
