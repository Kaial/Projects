def fib(n): #compute fib to n
    """Computes the fibonacci sequence up to n, returning a list of the results"""
    result = []
    a, b = 0, 1
    while a < n:
        result.append(a)
        a, b = b, a+b
    return result

n = input('Enter number of fib sequence to computer: ')
fibResult = fib(int(n))
print(fibResult)
