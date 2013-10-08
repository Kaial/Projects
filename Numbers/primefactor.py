def is_prime(n): #figure out if n is prime
    """Returns True if n is prime else false"""
    for i in range(2, int(n)):
        if n % i == 0:
            return False
        return True
        
        
n = int(input('Enter number to find prime factors of: '))
factors = []
for i in range(2, n + 1):
    while n % i == 0:
        if is_prime(n):
            factors.append(n)
        n = n/i
            
print(factors)
