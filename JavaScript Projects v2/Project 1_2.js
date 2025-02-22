// Function to check if a number is an Armstrong number iteratively
function isArmstrongIterative(num) {
    let sum = 0;
    let temp = num;
    const digits = num.toString().length;
    
    while (temp > 0) {
        let digit = temp % 10;
        sum += Math.pow(digit, digits);
        temp = Math.floor(temp / 10);
    }
    return sum === num;
}

// Function to check if a number is an Armstrong number recursively
function isArmstrongRecursive(num, temp = num, sum = 0, digits = num.toString().length) {
    if (temp === 0) return sum === num;
    return isArmstrongRecursive(num, Math.floor(temp / 10), sum + Math.pow(temp % 10, digits), digits);
}

// Function to get user input and check Armstrong number
function checkArmstrong() {
    let numStr = prompt("Enter a number to check if it is an Armstrong number: ");
    let num = numStr ? parseInt(numStr) : 0;
    
    if (isNaN(num) || num < 0) {
        console.log("Please enter a valid positive number.");
        return;
    }
    
    console.log("\nUsing Iterative Approach:");
    console.log(num + (isArmstrongIterative(num) ? " is an Armstrong number." : " is not an Armstrong number."));
    
    console.log("\nUsing Recursive Approach:");
    console.log(num + (isArmstrongRecursive(num) ? " is an Armstrong number." : " is not an Armstrong number."));
}

// Run the function
checkArmstrong();
