symbol = input("What symbol would you like to print? ")
x = input("Whats the width of the box? ")
y = input("What is the height of the box? ")
x = int(x)
y = int(y)
for a in range (0,y):
    for a in range (0,x):
        print(symbol, end="")
    for a in range (0,1):
        print("")
