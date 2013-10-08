#find digits of pi using machin like formula
from math import *

digits = input('Enter digits of pi to find: ')
print(str('{0:.%df}' % int(digits)).format(4 * (4 * atan(1.0/5.0) - atan(1.0/239.0))))
