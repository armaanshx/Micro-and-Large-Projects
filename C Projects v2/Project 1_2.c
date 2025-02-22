#include <stdio.h>

// Function to calculate factorial iteratively
unsigned long long factorialIterative(int n) {
    unsigned long long result = 1;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}

// Function to calculate factorial recursively
unsigned long long factorialRecursive(int n) {
    if (n == 0 || n == 1)
        return 1;
    return n * factorialRecursive(n - 1);
}

int main() {
    int num;
    printf("Enter a number to calculate its factorial: ");
    scanf("%d", &num);
    
    if (num < 0) {
        printf("Factorial is not defined for negative numbers.\n");
    } else {
        printf("\nUsing Iterative Approach:\n");
        printf("Factorial of %d is %llu\n", num, factorialIterative(num));
        
        printf("\nUsing Recursive Approach:\n");
        printf("Factorial of %d is %llu\n", num, factorialRecursive(num));
    }
    
    return 0;
}
