// Function to check if a number is prime iteratively
function isPrimeIterative(n: number): boolean {
    if (n < 2) return false;
    for (let i = 2; i * i <= n; i++) {
        if (n % i === 0) return false;
    }
    return true;
}

// Function to check if a number is prime recursively
function isPrimeRecursive(n: number, divisor: number = 2): boolean {
    if (n < 2) return false;
    if (divisor * divisor > n) return true;
    if (n % divisor === 0) return false;
    return isPrimeRecursive(n, divisor + 1);
}

// Function to get user input and check for prime number
function checkPrime(): void {
    let numStr = prompt("Enter a number to check if it's prime: ");
    let num = numStr ? parseInt(numStr) : 0;
    
    if (isNaN(num) || num < 0) {
        console.log("Please enter a valid positive number.");
        return;
    }
    
    console.log("\nUsing Iterative Approach:");
    console.log(num + (isPrimeIterative(num) ? " is a prime number." : " is not a prime number."));
    
    console.log("\nUsing Recursive Approach:");
    console.log(num + (isPrimeRecursive(num) ? " is a prime number." : " is not a prime number."));
}

// Run the function
checkPrime();
