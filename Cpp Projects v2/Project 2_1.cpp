#include <iostream>
#include <cmath>
using namespace std;

// Function to check if a number is prime iteratively
bool isPrimeIterative(int n) {
    if (n < 2) return false;
    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}

// Function to check if a number is prime recursively
bool isPrimeRecursive(int n, int i = 2) {
    if (n < 2) return false;
    if (i > sqrt(n)) return true;
    if (n % i == 0) return false;
    return isPrimeRecursive(n, i + 1);
}

int main() {
    int num;
    cout << "Enter a number to check if it's prime: ";
    cin >> num;

    cout << "\nUsing Iterative Approach:" << endl;
    if (isPrimeIterative(num))
        cout << num << " is a prime number." << endl;
    else
        cout << num << " is not a prime number." << endl;

    cout << "\nUsing Recursive Approach:" << endl;
    if (isPrimeRecursive(num))
        cout << num << " is a prime number." << endl;
    else
        cout << num << " is not a prime number." << endl;

    return 0;
}