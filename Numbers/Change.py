from decimal import *
def print_change(cost, amt): #compute change based on cost and amt (Decimal)
    """    
    Takes a cost in dollar ammount and an ammount given then computes change
    due and prints it out to standard output
    """
    if cost-amt == 0:
        return 0
    elif cost < 0 or amt < 0:
        return 0 #can't really do anything here
    elif amt < cost:
        return 0 #does. not. compute.
    r = amt - cost
    r = int((100 * r))
    q = (r//25)
    r = r - (q*25)
    d = (r//10)
    r = r - (d*10)
    n = (r//5)
    r = r - (n*5)
    p = r    
    print("{0} quarters {1} dimes {2} nickels {3} pennies".format(q, d, n, p))
    
itemCost = Decimal(input('How much does item cost: '))
amtPaid = Decimal(input('How much was paid: '))
print_change(itemCost,amtPaid)
