def is_prime(n): #figure out if n is prime
    """Returns True if n is prime else false"""
    for i in range(2, n):
        if n % i == 0:
            return False
        return True

prime = 0 
print('First prime is 2')      
while True:     
    yn = input('Find next prime? (y/n) :')
    if yn in ('n', 'no', 'q', 'exit'):
        break
    else:
        while not is_prime(prime): #keep incrementing to the next prime
            prime += 1
        print(prime)
        prime += 1
