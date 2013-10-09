#convert binary to decimal and decimal to binary
usr = input('Enter b for Binary to Decimal, enter d for Decimal to Binary:')
if usr in ('b', 'bin', 'binary'):
    num = input('Enter binary number: ')
    print(int(str(num),2))
elif usr in ('d', 'dec', 'decimal'):
    num = int(input('Enter decimal number: '))
    print(bin(num))
