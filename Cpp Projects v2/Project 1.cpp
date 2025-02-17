#include <iostream>
using namespace std;

// Recursive function to calculate factorial
long long factorialRecursive(int n) {
    if (n == 0 || n == 1)
        return 1;
    return n * factorialRecursive(n - 1);
}

// Iterative function to calculate factorial
long long factorialIterative(int n) {
    long long result = 1;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}

int main() {
    int num;
    
    cout << "Enter a number to calculate its factorial: ";
    cin >> num;
    
    if (num < 0) {
        cout << "Factorial is not defined for negative numbers." << endl;
    } else {
        cout << "\nUsing Iterative Approach: " << factorialIterative(num) << endl;
        cout << "Using Recursive Approach: " << factorialRecursive(num) << endl;
    }
    
    return 0;
}
