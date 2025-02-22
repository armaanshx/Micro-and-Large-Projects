#include <stdio.h>
#include <math.h>

// Function to count the number of digits in a number
int countDigits(int num) {
    int count = 0;
    while (num != 0) {
        count++;
        num /= 10;
    }
    return count;
}

// Iterative function to check Armstrong number
int isArmstrongIterative(int num) {
    int originalNum = num, sum = 0, digits = countDigits(num);
    while (num > 0) {
        int digit = num % 10;
        sum += pow(digit, digits);
        num /= 10;
    }
    return (sum == originalNum);
}

// Recursive function to calculate Armstrong sum
int armstrongRecursiveHelper(int num, int digits) {
    if (num == 0) return 0;
    int digit = num % 10;
    return pow(digit, digits) + armstrongRecursiveHelper(num / 10, digits);
}

// Wrapper function for recursive approach
int isArmstrongRecursive(int num) {
    return (armstrongRecursiveHelper(num, countDigits(num)) == num);
}

int main() {
    int num;
    printf("Enter a number to check if it's an Armstrong number: ");
    scanf("%d", &num);
    
    printf("\nUsing Iterative Approach:\n");
    if (isArmstrongIterative(num))
        printf("%d is an Armstrong number.\n", num);
    else
        printf("%d is not an Armstrong number.\n", num);
    
    printf("\nUsing Recursive Approach:\n");
    if (isArmstrongRecursive(num))
        printf("%d is an Armstrong number.\n", num);
    else
        printf("%d is not an Armstrong number.\n", num);
    
    return 0;
}
