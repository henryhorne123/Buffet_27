x = input("Please enter line length: ")
y = input("Do you want a verticle or horizontal line: ")
x = int(x)
if y == "verticle" or y == "Verticle":
    for a in range (0,x):
        print("*")

elif y == "horizontal" or y == "Horizontal":
    for a in range (0,x):
        print("*", end=" ")
print("")