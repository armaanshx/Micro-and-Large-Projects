#include <iostream>
using namespace std;

// Function to perform Bubble Sort iteratively
void bubbleSortIterative(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr[j], arr[j + 1]);
            }
        }
    }
}

// Function to perform Bubble Sort recursively
void bubbleSortRecursive(int arr[], int n) {
    if (n == 1) return;
    for (int i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            swap(arr[i], arr[i + 1]);
        }
    }
    bubbleSortRecursive(arr, n - 1);
}

// Function to print an array
void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;
    int arr[n], arrCopy[n];
    
    cout << "Enter the elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
        arrCopy[i] = arr[i];
    }
    
    cout << "\nUsing Iterative Bubble Sort:" << endl;
    bubbleSortIterative(arr, n);
    printArray(arr, n);
    
    cout << "\nUsing Recursive Bubble Sort:" << endl;
    bubbleSortRecursive(arrCopy, n);
    printArray(arrCopy, n);
    
    return 0;
}
