// Function to check palindrome iteratively
function isPalindromeIterative(str) {
    let left = 0, right = str.length - 1;
    while (left < right) {
        if (str[left] !== str[right]) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

// Function to check palindrome recursively
function isPalindromeRecursive(str, left, right) {
    if (left >= right) {
        return true;
    }
    if (str[left] !== str[right]) {
        return false;
    }
    return isPalindromeRecursive(str, left + 1, right - 1);
}

// Function to handle user input
function checkPalindrome() {
    let input = prompt("Enter a string or number to check if it's a palindrome:");
    let formattedInput = input.toLowerCase().replace(/[^a-z0-9]/g, ""); // Normalize input
    
    console.log("\nUsing Iterative Approach:");
    if (isPalindromeIterative(formattedInput)) {
        console.log(`${input} is a palindrome.`);
    } else {
        console.log(`${input} is not a palindrome.`);
    }
    
    console.log("\nUsing Recursive Approach:");
    if (isPalindromeRecursive(formattedInput, 0, formattedInput.length - 1)) {
        console.log(`${input} is a palindrome.`);
    } else {
        console.log(`${input} is not a palindrome.`);
    }
}

// Run the function
checkPalindrome();