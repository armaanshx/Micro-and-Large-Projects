import math

def is_prime_iterative(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def is_prime_recursive(n, i=2):
    if n < 2:
        return False
    if i > math.sqrt(n):
        return True
    if n % i == 0:
        return False
    return is_prime_recursive(n, i + 1)

def main():
    try:
        num = int(input("Enter a number to check if it's prime: "))
        
        print("\nUsing Iterative Approach:")
        if is_prime_iterative(num):
            print(f"{num} is a prime number.")
        else:
            print(f"{num} is not a prime number.")
        
        print("\nUsing Recursive Approach:")
        if is_prime_recursive(num):
            print(f"{num} is a prime number.")
        else:
            print(f"{num} is not a prime number.")
    
    except ValueError:
        print("Please enter a valid integer!")

if __name__ == "__main__":
    main()