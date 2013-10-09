
#Calculate mortgage payment and how long it will take to pay back
from decimal import *
c = Decimal(input('How much is your mortgage: '))
interest = Decimal(input('What is the interest rate: '))
intRate = (interest/100/12)
payment = ((intRate / (1 - (1 + interest/100/12) ** (-30*12)))*c).quantize(Decimal('.01'))

print('Your monthly rate is: ' + str(payment))

payBack = c / payment

print('It will take you %d months to pay it back' % payBack)