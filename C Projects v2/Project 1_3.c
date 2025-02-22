#include <stdio.h>

// Function to calculate factorial iteratively
unsigned long long factorialIterative(int n) {
    unsigned long long fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}

// Function to calculate factorial recursively
unsigned long long factorialRecursive(int n) {
    if (n == 0 || n == 1) return 1;
    return n * factorialRecursive(n - 1);
}

int main() {
    int num;
    printf("Enter a number to calculate its factorial: ");
    scanf("%d", &num);
    
    if (num < 0) {
        printf("Factorial is not defined for negative numbers.\n");
        return 1;
    }
    
    printf("\nUsing Iterative Approach:\n");
    printf("Factorial of %d is %llu\n", num, factorialIterative(num));
    
    printf("\nUsing Recursive Approach:\n");
    printf("Factorial of %d is %llu\n", num, factorialRecursive(num));
    
    return 0;
}
