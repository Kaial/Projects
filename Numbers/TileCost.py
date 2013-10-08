#calculate cost to tile a room given W and H

cost = float(input('Enter your tile cost per square foot: '))
height = float(input('Enter the height of your room: '))
width = float(input('Enter the width of your room: '))

sqFt = height * width
totalCost = sqFt * cost

print('Your total cost is %d' % totalCost) 