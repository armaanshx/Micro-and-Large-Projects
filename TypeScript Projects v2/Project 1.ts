// Function to generate Fibonacci series iteratively
function fibonacciIterative(n: number): number[] {
    let series: number[] = [0, 1];
    for (let i = 2; i < n; i++) {
        series.push(series[i - 1] + series[i - 2]);
    }
    return series.slice(0, n);
}

// Function to generate Fibonacci series recursively
function fibonacciRecursive(n: number, series: number[] = [0, 1]): number[] {
    if (series.length >= n) return series.slice(0, n);
    series.push(series[series.length - 1] + series[series.length - 2]);
    return fibonacciRecursive(n, series);
}

// Function to get user input and display Fibonacci series
function generateFibonacci(): void {
    let numStr = prompt("Enter the number of Fibonacci terms: ");
    let num = numStr ? parseInt(numStr) : 0;
    
    if (isNaN(num) || num <= 0) {
        console.log("Please enter a valid positive number.");
        return;
    }
    
    console.log("\nUsing Iterative Approach:");
    console.log(fibonacciIterative(num));
    
    console.log("\nUsing Recursive Approach:");
    console.log(fibonacciRecursive(num));
}

// Run the function
generateFibonacci();